public class SelectionSort {

    public static void sort(Comparable[] a) {
        int len = a.length;
        for(int i = 0; i < len; i++) {
            int min = i;
            for(int j= i + 1; j < len; j++) {
                if(less(a[j], a[min])) {
                    min = j;
                }
            }
            swap(a, i, min);
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
                return False;
            }
        }
        return True;
    }
}
