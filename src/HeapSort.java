import java.util.Arrays;

public class HeapSort {
    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) return array;

        // construct first max heap
        for(int i=array.length/2-1; i>=0; i--){
            heapify(array, i, array.length);
        }
        
        for(int i=array.length-1; i>0; i--){
            // swap the maximum value with the last element in the array
            Swap.swap(array, 0, i);
            // reconstruct max heap (only first element is required to move)
            heapify(array, 0, i);
        }

        return array;
    }

    public static void heapify(int[] array, int i, int len){
        int temp = array[i];
        for(int k=i*2+1; k<len; k=k*2+1) { // start from the left child of i
            // pick the largest value between the left and the right children
            if(k+1 < len && array[k] < array[k+1]) {
                k++;
            }

            // if child value is larger than parent's, assign its value to its parent's (no switch here)
            if(array[k] > temp) {
                array[i] = array[k];
                i = k;
            } else {
                break;
            }
        }
        // assign array[i] value to its largest child's (switch here)
        array[i] = temp;
    }
}
