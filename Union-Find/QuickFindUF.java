// Given a set of N nodes check if two nodes are connected. 
// If not connected, then connect them by giving them same ids


public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        // Set id of each object to itself
        id = new int[N]
        for(int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public Boolean isConnected(int p, int q) {
        // Check if p is connected to q by checking their ids
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        // Change all entries of id[p] to id[q]
        int pid = id[p];
        int qid = id[q];
        for(int i = 0; i < id.length; i++) {
            if(id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}