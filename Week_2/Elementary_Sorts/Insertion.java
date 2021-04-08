package Elementary_Sorts;

public class Insertion {

    public static void sort(Comparable[] a) {
        int len = a.length;
        for(int i = 0; i < len; i++) {
            for(int j = i; j > 0; j--) {
                if(less(a[j], a[j - 1])) {
                    swap(a, j, j - 1);
                }
                break;
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void swap(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static boolean isSorted(Comparable[] a) {
        int len = a.length;
        for(int i = 1; i < len; i++) {
            if(less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
