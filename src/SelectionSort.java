public class SelectionSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) return array;

        for (int i=0; i<array.length; i++) {
            int min_idx = i;
            for (int j=i; j<array.length; j++) {
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }
            Swap.swap(array, i, min_idx);
        }

        return array;
    }
}
