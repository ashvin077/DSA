import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        // array's index is always starts with 0

        // array declaration and memory allocation
        int [][] scores = new int [2][3];

        // taking inputs from user
        Scanner number = new Scanner(System.in);
        System.out.println("Enter Scores: ");
        for (int row= 0; row < 2 ; row++){
            for (int col = 0; col < 3 ; col++){
                System.out.print("Score for "+"["+row+"]"+"["+col+"] : ");
                scores[row][col] = number.nextInt();
            }
        }

        //Displaying the entered value
        System.out.println("Entered Scores are: ");
        for (int row = 0; row < 2; row++){
            for (int col = 0; col < 3; col++){
                System.out.print(scores[row][col]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
