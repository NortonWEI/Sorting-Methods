public class QuickSort {
    public static int[] sort(int[] array, int low, int high) {
        if (array == null || array.length == 0 || low >= high) return array;

        int left = low;
        int right = high;
        int pivot = low;

        while (left < right) {
            while (right > pivot) {
                if (array[pivot] > array[right]) {
                    Swap.swap(array, pivot, right);
                    pivot = right;
                    break;
                }
                right--;
            }

            while (left < pivot) {
                if (array[pivot] < array[left]) {
                    Swap.swap(array, pivot, left);
                    pivot = left;
                    break;
                }
                left++;
            }
        }

        sort(array, low, pivot-1);
        sort(array, pivot+1, high);

        return array;
    }
}
