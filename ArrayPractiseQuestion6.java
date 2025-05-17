// Multiplication of two arrays of size m x n and p x q

import java.util.Scanner;

public class ArrayPractiseQuestion6 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        // Declaring array
        int [][] first_array = new int[10][10];
        int [][] second_array = new int[10][10];
        int [][] result = new int[10][10];

        System.out.println("Enter the no. of rows and columns for First array: ");
        System.out.print("Rows: ");
        int m = number.nextInt();
        System.out.print("Columns: ");
        int n = number.nextInt();

        System.out.println("Enter the no. of rows and columns for Second array: ");
        System.out.print("Rows: ");
        int p = number.nextInt();
        System.out.print("Columns: ");
        int q = number.nextInt();

        if ( n == p){

            // taking input for first array
            System.out.println("Enter the values of first array: ");
            for (int row = 0; row < m; row++) {
                for (int cols = 0; cols < n; cols++) {
                    System.out.print("Value for " + "[" + row + "][" + cols + "]" + " is :");
                    first_array[row][cols] = number.nextInt();
                }
            }

            // taking input for second array
            System.out.println("Enter the values of second array: ");
            for (int row = 0; row < p; row++) {
                for (int cols = 0; cols < q; cols++) {
                    System.out.print("Value for " + "[" + row + "][" + cols + "]" + " is :");
                    second_array[row][cols] = number.nextInt();
                }
            }

            // Displaying value of both arrays
            System.out.println("Values of first array: ");
            for (int row = 0; row < m; row++) {
                for (int cols = 0; cols < n; cols++) {
                    System.out.print(first_array[row][cols]);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
            System.out.println("Values of second array: ");
            for (int row = 0; row < p; row++) {
                for (int cols = 0; cols < q; cols++) {
                    System.out.print(second_array[row][cols]);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
            // Calculating product
            for (int i = 0; i < m; i++){
                for (int j = 0; j < q; j++){
                    result[i][j] = 0;
                    for (int k = 0; k < p; k++) {
                        result[i][j] = result[i][j] + first_array[i][k] * second_array[k][j];
                    }
                }
            }

            // Displaying the result
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.print(result[i][j]);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
        }

        else {
            System.out.println("Array Size Mismatched");
        }

    }
}
