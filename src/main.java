
// Note: The youngest fo to the left (they are smaller than their father)
// Note: The older fo to the right (they are bigger than their father)


public class main {
    public static void main(String[] args) {
        System.out.println("Creating tree and adding 10 people, printing their ids");
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println(tree.add("195702", "Yossi")); 					//1
        System.out.println(tree.add("195708", "YossiSon")); 				//2
        System.out.println(tree.add("198706", "Momi")); 					//3
        System.out.println(tree.add("196706", "Anan"));						//4
        System.out.println(tree.add("194706", "Shemgar"));					//5
        System.out.println(tree.add("192705", "Sofo"));						//6
        System.out.println(tree.add("191709", "Superman"));					//7
        System.out.println(tree.add("199703", "LittleMan"));				//8
        System.out.println(tree.add("196806", "Magnetto"));					//9
        System.out.println(tree.add("196501", "Yael"));						//10
        
        //print the current root
        System.out.println("\nCurrent root:");
        tree.getRoot().print();												//11
        
        //delete root
        System.out.println("\nDeletes root node : 195702");
        tree.remove("195702");												//12
        
        //print new root node
        System.out.println("\nNew root:");
        tree.getRoot().print();												//13
        
        //query all tree from old to young
        System.out.println("\nPrint tree from oldest to youngest:");
        tree.printTreeFromOldestToYoungest();								//14

        
        //delete non-root node
        System.out.println("\nDeletes non-root node : 198706");
        tree.remove("198706");												//15
        
        //delete non-root node
        System.out.println("\nDeletes non-root node : 196706");
        tree.remove("196706");												//16
        
        
        //query all tree from old to young
        System.out.println("\nPrint tree from oldest to youngest:");
        tree.printTreeFromOldestToYoungest();								//17

        //print  root node
        System.out.println("\nCurrent root:");
        tree.getRoot().print();												//18
        
        //search
        System.out.println("\nSearching 194706");
        tree.search("194706");												//19
        
        //search
        System.out.println("\nSearching 196806");
        tree.search("196806");												//20
        
        //search
        System.out.println("\nSearching 191709");
        tree.search("191709");												//21
        

        //delete non-root node
        System.out.println("\nDeletes non-root node : 196706 <-- not found case");
        tree.remove("196706");												//22
        
        //delete root node
        System.out.println("\nDeletes root node : 194706");
        tree.remove("194706");												//23
        
       
        //search node that not exists
        System.out.println("\nSearching 194706, after deletion");
        tree.search("194706");												//24

        //search exists node
        System.out.println("\nSearching 196501:");
        tree.search("196501");												//25
        
        //search exists node
        System.out.println("\nSearching 195708:");
        tree.search("195708");												//26
        
        //search exists node
        System.out.println("\nSearching 196806:");
        tree.search("196806");												//27
        
        //search exists node
        System.out.println("\nSearching 192705:");
        tree.search("192705");												//28
        
        //query all tree from old to young
        System.out.println("\nPrint tree from oldest to youngest");
        tree.printTreeFromOldestToYoungest();								//29

        //delete non-root node
        System.out.println("\nDeletes non-root node : 196501");
        tree.remove("196501");												//30
        
        //delete non-root node
        System.out.println("\nDeletes non-root node : 195708");
        tree.remove("195708");												//31
        
        //delete non-root node
        System.out.println("\nDeletes non-root node : 196806");
        tree.remove("196806");												//32
        
        //delete non-root node
        System.out.println("\nDeletes non-root node : 192705");
        tree.remove("192705");												//33
        
        //query all tree from old to young
        System.out.println("\nPrint tree from oldest to youngest");
        tree.printTreeFromOldestToYoungest();								//34
        
        
        //print the current root
        System.out.println("\nCurrent root:");
        tree.getRoot().print();												//35
        
        System.out.println(tree.add("190507", "harry")); 					//36
        System.out.println(tree.add("190806", "talia")); 					//37
        System.out.println(tree.add("191004", "anna")); 					//38
        System.out.println(tree.add("191410", "yoav"));						//39
        System.out.println(tree.add("191610", "maor"));						//40
        System.out.println(tree.add("194804", "david"));					//41
        System.out.println(tree.add("199412", "noam"));						//42
        System.out.println(tree.add("199806", "ravid"));					//43
        System.out.println(tree.add("192306", "limor"));					//44
        System.out.println(tree.add("198912", "gilad"));					//45
        
        
        //query all tree from old to young
        System.out.println("\nPrint tree from oldest to youngest");
        tree.printTreeFromOldestToYoungest();								//46
        
        //delete non-root node with two leafs
        System.out.println("\n --- Deletes node with two leafs : 191410");
        tree.remove("191410");												//47
        

        
        //delete root node
        System.out.println("\nDeletesroot node : 191709");
        tree.remove("191709");												//48
        
        //print the new root
        System.out.println("\nnew root:");
        tree.getRoot().print();												//49
        	

        //query all tree from old to young
        System.out.println("\nPrint tree from oldest to youngest");
        tree.printTreeFromOldestToYoungest();								//50
        


    }
}


