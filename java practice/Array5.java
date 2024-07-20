import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];

        System.out.println("Enter 5 elements :");

        for(int i=0;i<number.length;i++){
            number[i]=input.nextInt();
        }

        System.out.println("5 Elements are: ");

        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
    
}
