import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int[] array = {4,8,7,1,9,5,6,3,10,0,2};
        /*
        System.out.printf(Arrays.toString(BubbleSort.sort(array)));
        System.out.println(Arrays.toString(QuickSort.sort(array, 0, array.length-1)));
        System.out.println(Arrays.toString(InsertionSort.sort(array)));
        System.out.println(Arrays.toString(ShellSort.sort(array)));
        System.out.println(Arrays.toString(SelectionSort.sort(array)));
        System.out.println(Arrays.toString(MergeSort.sort(array)));
         */
        System.out.println(Arrays.toString(RadixSort.sort(array)));
    }
}
