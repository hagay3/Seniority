
// Note: The youngest fo to the left (they are smaller than their father)
// Note: The older fo to the right (they are bigger than their father)


public class Algorithm {
    public static void main(String[] args) {
        BinarySearchTree root = new BinarySearchTree();
        root.add(new BSTNode("195706", "Older"));
        root.add(new BSTNode("198706", "Younger"));
        root.add(new BSTNode("196706", "Medium"));
        
        
        //print left node
        root.getRoot().getLeft().print();
    }
}


