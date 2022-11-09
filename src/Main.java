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
            System.out.print("Column of matrix A: ");
            colA = input.nextInt();
        } while (colA < 1 || colA > 5);

        matrixA = new int[rowA][colA];

        for (int i=0 ; i < rowA ; i++) {
            for (int j=0 ; j < colA ; j++) {
                System.out.print("Enter the value of Matrix A, " + (i+1) + "x" + (j+1) + ": ");
                matrixA[i][j] = input.nextInt();
            }
        }


        do {
            System.out.print("Row of matrix B: ");
            rowB = input.nextInt();
        } while ((colA != rowB) || (rowB < 1 || rowB > 5));

        do {
            System.out.print("Column of matrix B: ");
            colB = input.nextInt();
        } while (colB < 1 || colB > 5);

        matrixB = new int[rowB][colB];

        for (int i=0 ; i < rowB ; i++) {
            for (int j=0 ; j < colB; j++) {
                System.out.print("Enter the value of Matrix B, " + (i+1) + "x" + (j+1) + ": ");
                matrixB[i][j] = input.nextInt();
            }
        }


        matrixC = new int[rowA][colB];

        for (int sumRow = 0 ; sumRow < rowA ; sumRow++) {
            for (int sumCol = 0 ; sumCol < colB ; sumCol++) {
                matrixC[sumRow][sumCol] = 0;
            }
        }

        //multiple the matrices
        for (int i=0 ; i < rowA ; i++) {
            for (int j=0 ; j < colB ; j++) {
                for (int k=0 ; k < colA ; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        for (int i=0 ; i < rowA ; i++) {
            for (int j=0 ; j < colB ; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
