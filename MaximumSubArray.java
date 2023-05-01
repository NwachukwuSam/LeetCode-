package LeetCode;

import java.util.Scanner;

public class MaximumSubArray {
    public static int maxSub(int [] number){
        int currentMax = number[0];
        int maxSubs = number[0];
        for (int i = 0; i < number.length; i++) {
            currentMax = Math.max(number[i],currentMax+number[i]);
            maxSubs = Math.max(maxSubs, currentMax);
        }
        return maxSubs;
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.println("How many numbers do you wish to input: ");
        int number = inputs.nextInt();
        int [] nums = new int [number];

        System.out.println("Enter the Actual numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = inputs.nextInt();
        }
        System.out.println("The maximum sub-array is == " + maxSub(nums));
    }
}
