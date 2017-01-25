

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BSTNode {

    private LocalDate dateOfBirth;
    private String name;
    private int id;
    private BSTNode left,right;
    public static int counter = 0;

    public BSTNode(LocalDate date, String name) {
        this.dateOfBirth = date;
        this.name = name;
        counter++;
        this.id = counter;
    };

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public int add(BSTNode newNode) {

        if (newNode.dateOfBirth.isAfter(this.dateOfBirth)) {
            if (left == null) {
                left = newNode;
            } else
            	return left.add(newNode);
        } else if (newNode.dateOfBirth.isBefore(this.dateOfBirth)) {
            if (right == null) {
                right = newNode;
            } else
                return right.add(newNode);
        }
        return counter;
    }

    public void search(LocalDate searchDate) {

        if (searchDate.isEqual(this.dateOfBirth))
            printNameAndId();
        else if (searchDate.isAfter(this.dateOfBirth)) {
            if (left == null)
                System.out.println(" node not found");
            else
                left.search(searchDate);
        } else if (searchDate.isBefore(this.dateOfBirth)) {
            if (right == null)
                System.out.println(" node not found");
            else
                right.search(searchDate);
        }

    }


    public void remove(LocalDate removeNodeDate, BSTNode parent) {

        if (removeNodeDate.isAfter(this.dateOfBirth)) {
            if (left != null)
                left.remove(removeNodeDate, this);
            else
                System.out.println("node not found");
        } else if (removeNodeDate.isBefore(this.dateOfBirth)) {
            if (right != null)
                right.remove(removeNodeDate, this);
            else
                System.out.println("node not found");
        } else {
            if (left != null && right != null) {
                this.dateOfBirth = right.minValue().dateOfBirth;
                this.name = right.minValue().name;
                this.id = right.minValue().id;
                
                right.remove(this.dateOfBirth, this);
            } else if (parent.left.dateOfBirth.isEqual(this.dateOfBirth)) {
                parent.left = (left != null) ? left : right;
            } else if (parent.right == this) {
                parent.right = (left != null) ? left : right;
            }
        }
    }

    private BSTNode minValue() {
        if (left == null)
            return this;
        else
            return left.minValue();
    }

    public void visit(){
        if (right != null) { right.visit(); }
        this.print();
        if (left != null) {  left.visit(); }
    }

    public void print(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMM");
        System.out.println(dateOfBirth.format(formatter) + " : " + this.name + " : id "+ this.id);
    }

    public void printNameAndId() {System.out.println("id " + this.id + ": " + this.name);}

}