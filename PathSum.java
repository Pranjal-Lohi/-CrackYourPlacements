import javax.swing.tree.TreeNode;

public class PathSum {
     public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null && root.val == targetSum) return true;
        if(hasPathSum(root.left,targetSum - root.val) || hasPathSum(root.right, targetSum - root.val)) return true;
        else return false;
    }
}
