// Given a set of N nodes check if two nodes have the same root. 
// If not connected, then connect their parent roots the same in a manner that the smaller tree gets joined to the larger tree.
// After finding root, set id of each examined root to point to that root


public class WeightedQuickUnionPathCompressionUF {
    private int[] id;
    private int[] sz;

    public WeightedQuickUnionPathCompressionUF(int N) {
        // Set id of each object to itself
        id = new int[N]
        sz = new int[N]
        for(int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    private int root(int i) {
        // Change parent pointer until reach root and lift root up on every iteration
        while(i != id[i]) {
            id[i] = id[id[i]];
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
        if(sz[root_p] < sz[root_q]) {
            id[root_p] = root_q;
            sz[root_q] += sz[root_p]
        } else {
            id[root_q] = root_p;
            sz[root_p] += sz[root_q]
        }
    }
}