

class BFSonGraph {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = new int[V+1];
        Queue<Integer> q = new LinkedList<>();
        
        arr[0] = 1;
        q.add(0);
        
        while(!q.isEmpty()){
            int x = q.peek();
            q.remove();
            list.add(x);
            
            for(int i = 0; i<adj.get(x).size();i++){
                if(arr[adj.get(x).get(i)]==0){
                    arr[adj.get(x).get(i)] = 1;
                    q.add(adj.get(x).get(i));
                }
            }
        }
        return list;
    }
}