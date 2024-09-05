public class LargestBST {
    public static class Gnode{
        int min;
        int max;
        int val;
        
        Gnode(int min,int max,int val){
            this.min=min;
            this.max=max;
            this.val=val;
        }
    }
        public static Gnode func(Node root){
            
            if(root==null){
                return new Gnode(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
            }
            
            Gnode left=func(root.left);
            Gnode right=func(root.right);
            
            if(left.max < root.data && root.data < right.min){
                return new Gnode(Math.min(left.min,root.data),Math.max(right.max,root.data),left.val+right.val+1);
            }
            
            return new Gnode(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(left.val,right.val));
        
            
        }
        
        // Return the size of the largest sub-tree which is also a BST
        static int largestBst(Node root)
        {
            // Write your code here
            return func(root).val;
            
        }
}
