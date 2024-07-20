import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        // taking input from user
        System.out.println("Enter the numbers of array:- ");
        for (int i = 0; i < 5; i++) {
            number[i] = input.nextInt();
        }
        // printing the array
        System.out.println("Elements are:- ");
        for (int i = 0; i < 5; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
