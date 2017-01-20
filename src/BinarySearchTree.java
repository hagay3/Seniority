import java.time.LocalDate;

public class BinarySearchTree {

    private BSTNode root;


    public BinarySearchTree() {}

    public BSTNode getRoot() {
        return root;
    }

    public void setRoot(BSTNode root) {
        this.root = root;
    }

    public int add(BSTNode newNode) {
        if (root == null) {
            root = newNode;
            return BSTNode.counter;
        } else
            return root.add(newNode);
    }
}