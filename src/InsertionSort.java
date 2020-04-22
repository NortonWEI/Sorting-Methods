public class InsertionSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) return array;

        for (int i=1; i<array.length; i++) {
            for (int j=i; j>0; j--) {
                if (array[j] < array[j-1]) {
                    Swap.swap(array, j, j-1);
                }
            }
        }

        return array;
    }
}
