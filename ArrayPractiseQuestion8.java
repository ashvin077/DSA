// transpose of matrix

import java.util.Scanner;

public class ArrayPractiseQuestion8 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int row, col;
        int [][] matrix = new int[10][10];
        int [][] transpose = new int[10][10];

        // taking input from user
        System.out.println("Enter Number of rows and columns:");
        System.out.print("Rows: ");
        row = number.nextInt();

        System.out.print("Columns: ");
        col = number.nextInt();

        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("["+i+"]"+"["+j+"] : ");
                matrix[i][j] = number.nextInt();
            }
        }

        // computing transpose
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++ ) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // display the transpose of matrix
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++ ) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
