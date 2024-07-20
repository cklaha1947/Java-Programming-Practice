import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];

        System.out.println("Enter 5 Elements: ");
        for (int i = 0; i < 5; i++) {
            number[i] = input.nextInt();
        }

        System.out.println("5 Elements are: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(number[i] + " ");

        }
    }

}
