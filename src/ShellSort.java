public class ShellSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) return array;

        for (int gap = array.length; gap > 0; gap /= 2) {
            for (int i=0; i<gap; i++) {
                for (int j=i+gap; j < array.length; j+=gap) {
                    for (int k=j; k>=gap; k-=gap) {
                        if (array[k] < array[k-gap]) {
                            Swap.swap(array, k, k-gap);
                        }
                    }
                }
            }
        }

        return array;
    }
}
