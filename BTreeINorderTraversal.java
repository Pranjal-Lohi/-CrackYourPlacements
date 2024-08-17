import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BTreeINorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> array = new ArrayList<>();
        inorderRec (root, array);
        return array;
    }
    private void inorderRec(TreeNode root, List<Integer> result){
        if (root == null) {
            return;
        } 
        inorderRec(root.left, result);
        result.add(root.val);
        inorderRec(root.right, result);
    }
}
