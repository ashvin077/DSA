import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // declaration and memory allocation of 1D array
        int []marks = new int[7];   // it takes the marks for 7 person

        // We can initialize 1D array from different approach as well
        int [] score;   // declaration
        score = new int[5];     // memory allocation

        int [] points = {15,20,58,50,23,56};    // declaration and memory allocation
        // this approach ([]points) is recommended only if there are few numbers of inputs.

        // finding length of array
        System.out.println(points.length);

        // Taking input from user in 1D array
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the Marks of Five Students: ");
        for (int i = 0; i<7; i++){
            System.out.print("Marks of Roll no. "+(i+1)+": ");
            marks[i] = number.nextInt();
        }

        // Displaying outputs in 1D array
        System.out.println("Enter marks are: ");
        for (int i = 0 ; i < 7; i++){
            System.out.println("Marks of Roll no. "+(i+1)+" is "+marks[i]);
        }

        // Another way of printing element of array
        for (int elements: marks){
            System.out.println(elements);
        }

    }
}
