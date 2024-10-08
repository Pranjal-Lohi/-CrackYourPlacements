public class DFSOfGraph {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        
        dfs(0, adj, visited, ans);
        return ans;
    }
    public void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visted, ArrayList<Integer> ans){
        visted[v] = true;
        
        ans.add(v);
        
        for (Integer neighber: adj.get(v)) {
            if (!visted[neighber]) {
                dfs(neighber, adj, visted, ans);
            }
        }
    }
}
