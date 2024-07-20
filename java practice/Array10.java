import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        // taking input from user:-
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]=", row, col);
                A[row][col] = input.nextInt();
            }
        }
        // printing the matrix:-
        System.out.println("A= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + A[row][col]);

            }
            System.out.println();
        }

    }

}
