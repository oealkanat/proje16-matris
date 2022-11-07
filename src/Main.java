import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrixA, matrixB, matrixC;
        int rowA, colA, rowB, colB, rowC, colC;

        do {
            System.out.print("Row of matrix A: ");
            rowA = input.nextInt();
        } while (rowA < 1 || rowA > 5);

        do {
            System.out.print("Line of matrix A: ");
            colA = input.nextInt();
        } while (colA < 1 || colA > 5);

        do {
            System.out.print("Row of matrix B: ");
            rowB = input.nextInt();
        } while ((colA != rowB) || (rowB < 1 || rowB > 5));

        do {
            System.out.print("Line of matrix B: ");
            colB = input.nextInt();
        } while (colB < 1 || colB > 5);

        matrixA = new int[rowA][colA];
        matrixA = new int[rowB][colB];
        matrixC = new int[rowA][colB];

        for (int sumRow = 0 ; sumRow < rowA ; sumRow++) {
            for (int sumCol = 0 ; sumCol < colB ; sumCol++) {
                matrixC[sumRow][sumCol] = 0;
            }
        }

        for (int i=0 ; i < rowA ; i++) {
            for (int j=0 ; j < colB ; j++) {
                System.out.print(matrixC[i][j]);
            }
            System.out.print("\n");
        }
    }
}
