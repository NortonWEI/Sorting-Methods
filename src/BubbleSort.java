public class BubbleSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) return array;

        for (int len = array.length; len>0; len--) {
            for (int i=0; i<len-1; i++) {
                if (array[i] > array[i+1]) {
                    Swap.swap(array, i, i+1);
                }
            }
        }
        return array;
    }
}
