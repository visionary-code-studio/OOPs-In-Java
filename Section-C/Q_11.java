import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        // Initialize an array with exactly 6 elements
        int[] arr = {64, 34, 25, 12, 22, 11};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        // Perform Bubble Sort
        bubbleSort(arr);
        
        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Outer loop controls the number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Inner loop compares adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the current element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    // Mark that a swap occurred in this pass
                    swapped = true;
                }
            }
            
            // Optimization: If no elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
