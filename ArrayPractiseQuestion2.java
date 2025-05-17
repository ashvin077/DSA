// Write a program to find out whether a given integer is present in an array or not.

import java.util.Scanner;

public class ArrayPractiseQuestion2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        float num_check = number.nextFloat();
        float [] marks = {20.5f,30.4f,25.6f,28.5f,24.3f};
        boolean isInArray = false;

        for (float elements : marks){
            if(num_check == elements) {
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The number is in Array");
        }
        else {
            System.out.println("The number is in not in Array");
        }
    }
}
