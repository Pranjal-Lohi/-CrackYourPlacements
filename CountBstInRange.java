public class CountBstInRange {
    int getCount(Node root,int l, int h)
    {
        //Your code here
        ArrayList<Integer> arr = new ArrayList<>();
        inOrder(root, arr);
        int count = 0;
        for(int i = 0; i<arr.size();i++){
            if(l<=arr.get(i) && arr.get(i)<=h) count++;
        }
        return count;
    }
    void inOrder(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }
}
