package Activities;

public class Activity2 {

    public static void main(String[] args) {
        // Step 1: Initialize the array
        int[] numbers = {10, 77, 10, 54, -11, 10};

        // Step 2: Declare a variable to hold the sum of 10s
        int sum = 0;

        // Step 3: Loop through the array
        for (int num : numbers) {
            if (num == 10) {
                sum += num;
            }
            
            if(sum>30) {
            	break;
            }
        }

        // Step 4: Check if the sum of 10s is exactly 30
        if (sum == 30) {
            System.out.println("Sum value is : "+sum);
        } else {
            System.out.println("Sum value is not 30");
        }
    }
}