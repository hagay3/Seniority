
// Note: The youngest fo to the left (they are smaller than their father)
// Note: The older fo to the right (they are bigger than their father)


public class main {
    public static void main(String[] args) {
        System.out.println("Creating tree and adding 10 people, printing their ids");
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println(tree.add("195702", "Yossi"));
        System.out.println(tree.add("195708", "YossiSon"));
        System.out.println(tree.add("198706", "Momi"));
        System.out.println(tree.add("196706", "Anan"));
        System.out.println(tree.add("194706", "Shemgar"));
        System.out.println(tree.add("192705", "Sofo"));
        System.out.println(tree.add("191709", "Superman"));
        System.out.println(tree.add("199703", "LittleMan"));
        System.out.println(tree.add("196806", "Magnetto"));
        System.out.println(tree.add("196501", "Yael"));
        
        System.out.println("\nCurrent root");
        tree.getRoot().print();
        
        System.out.println("\n --- Deletes root node : 195702");
        tree.remove("195702");
        System.out.println("\nNew root");
        tree.getRoot().print();
        System.out.println("\nPrint tree from oldest to youngest");
        tree.printTreeFromOldestToYoungest();


        System.out.println("\n --- Searching 194706");
        tree.search("194706");

        System.out.println("\n --- Deletes 196706 and 194706");
        tree.remove("194706");
        tree.remove("196706");

        System.out.println("\n --- Searching 194706, after deletion");
        tree.search("194706");

        System.out.println("\nPrint tree from oldest to youngest");
        tree.printTreeFromOldestToYoungest();

        System.out.println("\n --- Adding 193604");
        tree.add("193604", "Donatelo");
        System.out.println("\nPrint tree from oldest to youngest");
        tree.printTreeFromOldestToYoungest();

        System.out.println("\n --- Deletes node with two leafs : 198706");
        tree.remove("198706");
        System.out.println("\nPrint tree from oldest to youngest");
        tree.printTreeFromOldestToYoungest();



    }
}


