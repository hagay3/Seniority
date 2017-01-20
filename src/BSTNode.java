import com.sun.org.apache.xpath.internal.operations.Bool;

import java.time.LocalDate;

public class BSTNode {

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

    private LocalDate dateOfBirth;
    private String name;
    private int id;
    private BSTNode left,right;
    public static int counter = 0;

    public BSTNode(String date, String name) {
        this.dateOfBirth = parseDate(date);
        this.name = name;
        counter++;
        this.id = counter;
    };

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
                left.add(newNode);
        } else if (newNode.dateOfBirth.isBefore(this.dateOfBirth)) {
            if (right == null) {
                right = newNode;
            } else
                return right.add(newNode);
        }
        return counter;
    }

    public void print(){
        System.out.println(this.dateOfBirth+ ", " +this.name);
    }

    private LocalDate parseDate(String date){
        return LocalDate.parse(date.substring(0,4)+"-"+date.substring(4,6)+"-01");
    }

}