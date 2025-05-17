// Calculate sum of numbers in one dimensional array

public class ArrayPractiseQuestion1 {
    public static void main(String[] args) {
        float [] marks = {20.5f,30.4f,25.6f,28.5f,24.3f};
        // you can also take inputs from user as well

        float sum = 0;
        for (float elements : marks){
            sum = elements + sum;
        }
        System.out.println("The value of SUM is: "+sum);
    }
}
