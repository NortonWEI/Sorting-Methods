public class RadixSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) return array;

        int max = array[0];
        for (int e : array) {
            if (e > max) max = e;
        }

        int maxDigit = 0;
        for (; max > 0; max /= 10) {
            maxDigit++;
        }

        // LSD
        for (int i = 0; i < maxDigit; i++) {
            int[][] bucket = new int[10][array.length];
            int[] lenArray = new int[bucket.length];
            int idx = 0;
            for (int value : array) {
                int quotient = value / (int) Math.pow(10, i);
                int digit = quotient % 10;
                bucket[digit][lenArray[digit]] = value;
                lenArray[digit]++;
            }

            for (int j=0; j<bucket.length; j++) {
                QuickSort.sort(bucket[j], 0, lenArray[j]-1);
                for (int k=0; k<lenArray[j]; k++) {
                    array[idx++] = bucket[j][k];
                }
            }
        }

        return array;
    }
}
