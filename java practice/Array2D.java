import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[][] A= new int[2][3];

        System.out.println("Enter elements for A matrix: ");

        //getting input for A matrix

        


        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.printf("A[%d][%d]= ",row,col);
                
                
                A[row][col]=input.nextInt();
            }
        }
        

        //printing A matrix
        System.out.print("A= ");
        
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print("\t"+A[row][col]);
                
            }
            System.out.println();
        }


    }
    
}
