import java.util.ArrayList;

public class DetectCycleinGraph {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int[] visited = new int[V];
        for(int i=0; i<V;i++){
            if(visited[i]!=1)
                if(detectCycle(adj, visited, i, -1) == true)
                    return true;
        }
        return false;
    }
    
    public boolean detectCycle(ArrayList<ArrayList<Integer>> adj, int[] visited, int node
        ,int parent){
            visited[node] = 1;
            for(int neighbor : adj.get(node)) {
                if(visited[neighbor]!=1){
                    return detectCycle(adj, visited, neighbor, node);
                } else if(neighbor != parent){
                    return true;
                }
            }
            return false;
        }

}
