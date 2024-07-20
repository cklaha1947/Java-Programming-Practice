
import java.util.Scanner;

public  class Array2{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double[] number= new double[5]; //Array declration and definition
System.out.println("Please enter 5 numbers: ");
     //taking inputs from user
        for(int i=0; i<5;i++){
            number[i]=input.nextDouble();
        }
    //print array elements
        for(int i=0;i<5;i++){
            System.out.println(number[i]);
        }
        //System.out.println("ck laha");
    }
}