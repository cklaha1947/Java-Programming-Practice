import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[10];

        System.out.println("Enter 10 elements: ");

        for(int i=0;i<10;i++){
            number[i]= input.nextInt();
        }

        System.out.println(" elements are: ");

        for(int i=0;i<10;i++){
            System.out.println(number[i]);
        }
    }
    
}
