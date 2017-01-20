import com.sun.source.tree.BinaryTree;
import java.util.TreeMap;
import javax.swing.tree.DefaultMutableTreeNode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 * Created by hagai-home on 14/01/2017.
 */

// Note: The youngest fo to the left (they are smaller than their father)
// Note: The older fo to the right (they are bigger than their father)


public class Algorithm {
    public static void main(String[] args) {
        BinarySearchTree root = new BinarySearchTree();
        root.add(new BSTNode("195706", "Older"));
        root.add(new BSTNode("198706", "Younger"));
        root.add(new BSTNode("196706", "Medium"));

        root.getRoot().getLeft().print();
    }
}
