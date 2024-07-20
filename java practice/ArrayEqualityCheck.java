import java.util.Arrays;

public class ArrayEqualityCheck {
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 1, 2, 3, 4, 5 };
        int[] array3 = { 1, 2, 3, 4, 6 };

        System.out.println("array1 and array2 are equal: " + areArraysEqual(array1, array2)); // true
        System.out.println("array1 and array3 are equal: " + areArraysEqual(array1, array3)); // false
    }
}
