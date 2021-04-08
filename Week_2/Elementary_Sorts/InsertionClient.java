package Elementary_Sorts;

public class InsertionClient implements Comparable<InsertionClient>{

    private int x;

    public int compareTo(InsertionClient that) {
        if (this.x < that.x) {
            return -1;
        } else if(this.x > that.x) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Comparable[] a = {33, 44, 77, 11, 66, 99, 22, 55};
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        Insertion.sort(a);
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}