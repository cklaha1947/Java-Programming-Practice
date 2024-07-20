import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n <= 1)
            return;

        int i = n - 2;
        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            // Step 2: Find the element just larger than nums[i] from the end
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Step 4: Reverse the elements from i+1 to the end
        reverse(nums, i + 1, n - 1);
    }

    // Helper function to swap elements
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper function to reverse elements
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        System.out.println("Original array: " + Arrays.toString(array));
        nextPermutation(array);
        System.out.println("Next permutation: " + Arrays.toString(array));

        // Test with another array
        int[] array2 = { 3, 2, 1 };
        System.out.println("Original array: " + Arrays.toString(array2));
        nextPermutation(array2);
        System.out.println("Next permutation: " + Arrays.toString(array2));

        // Test with another array
        int[] array3 = { 1, 1, 5 };
        System.out.println("Original array: " + Arrays.toString(array3));
        nextPermutation(array3);
        System.out.println("Next permutation: " + Arrays.toString(array3));
    }
}
