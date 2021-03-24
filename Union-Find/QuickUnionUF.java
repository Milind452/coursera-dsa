// Given a set of N nodes check if two nodes have the same root. 
// If not connected, then connect their parent roots the same


public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int N) {
        // Set id of each object to itself
        id = new int[N]
        for(int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        // Change parent pointer until reach root
        while(i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public Boolean isConnected(int p, int q) {
        // Check if p and q have same root
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        // Change root of p to point ay root of q
        int root_p = root(p);
        int root_q = root(q);
        id[root_p] = root_q;
    }
}