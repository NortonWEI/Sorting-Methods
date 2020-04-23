public class SelectionSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) return array;

        for (int i=0; i<array.length; i++) {
            int minIdx = i;
            for (int j=i; j<array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            Swap.swap(array, i, minIdx);
        }

        return array;
    }
}
