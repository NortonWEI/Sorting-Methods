public class Tester {
    public static void main(String[] args) {
        int[] array = {4,8,7,1,9,5,6,3,10,0,2};
        /*
        for (int e: BubbleSort.sort(array)) System.out.printf("%d,", e);
        System.out.println();
        for (int e: QuickSort.sort(array, 0, array.length-1)) System.out.printf("%d,", e);
        System.out.println();
        for (int e: InsertionSort.sort(array)) System.out.printf("%d,", e);
        System.out.println();
         */
        for (int e: ShellSort.sort(array)) System.out.printf("%d,", e);
        System.out.println();
    }
}
