import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BinarySearchTree {

    private BSTNode root;


    public BinarySearchTree() {}

    public BSTNode getRoot() {
        return this.root;
    }

    public void setRoot(BSTNode root) {
        this.root = root;
    }

    public int add(String date, String name) {
        LocalDate myLocalDate = parseDate(date);
        BSTNode newNode = new BSTNode(myLocalDate, name);
        if (root == null) {
            root = newNode;
            return BSTNode.counter;
        } else
            return root.add(newNode);
    }

    public void search(String date){
        if (this.root == null)
            System.out.println("root is null");
        else
            this.root.search(parseDate(date));
    }

    public void remove(String removeNodeDate) {
        if (this.root == null)
            System.out.println("root is null");
        else {
            System.out.println("Removes root");
            LocalDate myDate = parseDate(removeNodeDate);
            if (this.root.getDateOfBirth().isEqual(myDate)) {
                BSTNode auxRoot = new BSTNode(LocalDate.MIN,"dummyRoot");
                auxRoot.setLeft(this.root);
                this.root.remove(myDate, auxRoot);
                root = auxRoot.getLeft();
            } else {
                this.root.remove(myDate, null);
            }
        }
    }

    public void printTreeFromOldestToYoungest(){
        root.visit();
    }

    public LocalDate parseDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        return LocalDate.parse(date+"01", formatter);
    }
}