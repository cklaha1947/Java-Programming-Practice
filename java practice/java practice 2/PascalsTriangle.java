public class PascalsTriangle {

    public static void main(String[] args) {
        int numRows = 10; // You can change this to generate more or fewer rows
        int[][] triangle = generatePascalsTriangle(numRows);
        printPascalsTriangle(triangle);
    }

    public static int[][] generatePascalsTriangle(int numRows) {
        int[][] triangle = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        return triangle;
    }

    public static void printPascalsTriangle(int[][] triangle) {
        for (int[] row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
