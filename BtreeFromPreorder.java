import java.util.Arrays;

import javax.swing.tree.TreeNode;

public class BtreeFromPreorder {
     public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        if(preorder == null || postorder == null || preorder.length == 0 || postorder.length == 0) return null;

        TreeNode root = new TreeNode(preorder[0]);
        int mid = 0;

        if(preorder.length == 1) return root;

        for(int i=0; i<postorder.length;i++){
            if(preorder[1] == postorder[i]){
                mid = i;
                break;
            }
        }
        root.left = constructFromPrePost(
                                            Arrays.copyOfRange(preorder, 1, 1 + mid + 1),
                                            Arrays.copyOfRange(postorder, 0, mid + 1));
        
        root.right = constructFromPrePost(
                                            Arrays.copyOfRange(preorder, 1 + mid + 1, preorder.length),
                                            Arrays.copyOfRange(postorder, mid + 1, postorder.length - 1));
        return root;
    }
}