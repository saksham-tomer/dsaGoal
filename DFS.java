import java.util.ArrayList;

public class DFS {
    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
        vis[node] = true;
        ls.add(node);
        for (int val : adj.get(node)) {
            if (vis[val] != true) {
                dfs(node, vis, adj, ls);
            }
        }
    }

    public static ArrayList<Integer> findDfs(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V + 1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls);
        return ls;
    }

}
