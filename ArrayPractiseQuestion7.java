// Arranging the array in ascending order

import java.util.Scanner;

public class ArrayPractiseQuestion7 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int [] values = new int[20];    // declaration of array
        int n ;
        System.out.println("How many numbers are there? :  ");
        n = number.nextInt();

        // taking input
        System.out.println("kindly give inputs: ");
        for (int row = 0; row < n; row++ ) {
            values[row] = number.nextInt();
        }

        // displaying given order of array
        System.out.print("\nGiven Numbers: \n");
        for (int row = 0; row < n; row++ ) {
            System.out.print(values[row]+" ");
        }

        // arranging in ascending order
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j= i+1; j < n; j++) {

                if (values[i] > values[j]) {      // use "<" to get descending order
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }

        // displaying arranged order of array
        System.out.print("\nAscending order of Numbers: \n");
        for (int row = 0; row < n; row++ ) {
            System.out.print(values[row]+" ");
        }

    }
}
