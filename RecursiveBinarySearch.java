public class RecursiveBinarySearch {

    // Recursive binary search function
    public static int binarySearch(int[] arr, int target, int left, int right) {
        // Base case: If left index exceeds right, the element is not present
        if (left > right) {
            return -1; // Target not found
        }

        // Calculate the middle index
        int mid = left + (right - left) / 2;

        // Check if the target is present at the mid
        if (arr[mid] == target) {
            return mid; // Target found
        }

        // If the target is smaller than mid, search the left half
        if (target < arr[mid]) {
            return binarySearch(arr, target, left, mid - 1);
        } else {
            // Else, search the right half
            return binarySearch(arr, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        // Sorted array for binary search
        int[] arr = {2, 3, 4, 10, 40, 50, 80};

        int target = 10;
        int result = binarySearch(arr, target, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
