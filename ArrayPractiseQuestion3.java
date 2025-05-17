// Calculate average marks of all student in a particular subject

import java.util.Scanner;

public class ArrayPractiseQuestion3 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        //  Declaring array
        int [] marks = new int[7];

        // Taking Input
        System.out.println("Enter the marks of seven student: ");
        for (int i=0; i<7; i++){
            System.out.print("Marks of Roll No: "+(i+1)+" is : ");
            marks[i] = number.nextInt();
        }

        // Calculating Sum
        int sum = 0;
        for (int elements: marks){
            sum = sum + elements;
        }
        System.out.println("The total sum of marks is : "+sum);

        // Calculating Average
        int average = sum/marks.length;
        System.out.println("The average of marks is: "+average);
    }
}
