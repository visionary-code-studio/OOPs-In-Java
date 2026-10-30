public class BinarySearchExample {

    // Method to perform binary search on a sorted array
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Calculates the middle point (avoids potential integer overflow)
            int mid = low + (high - low) / 2;

            // Check if the target is present at the middle
            if (arr[mid] == target) {
                return mid; 
            }

            // If target is smaller than the mid element, search the left half
            if (arr[mid] > target) {
                high = mid - 1;
            } 
            // If target is larger than the mid element, search the right half
            else {
                low = mid + 1;
            }
        }

        // Element was not present in the array
        return -1;
    }

    public static void main(String[] args) {
        // Input array must be sorted for Binary Search to work
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int targetElement = 23;

        System.out.println("Searching for: " + targetElement);
        
        int resultIndex = binarySearch(sortedArray, targetElement);

        if (resultIndex == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + resultIndex);
        }
    }
}
