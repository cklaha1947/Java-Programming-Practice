import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if key is present at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If key is greater, ignore left half
            if (arr[mid] < key) {
                left = mid + 1;
            } else { // If key is smaller, ignore right half
                right = mid - 1;
            }
        }
        return -1; // Element not found, return -1
    }

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        int key = 50;

        // The array needs to be sorted for binary search to work
        Arrays.sort(array);

        int result = binarySearch(array, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
