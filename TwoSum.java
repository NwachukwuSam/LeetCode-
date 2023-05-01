package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int [] checkTwoSum(int [] number, int target){
        for (int i = 0; i < number.length; i++) {
            for (int j = i +1; j < number.length ; j++) {
                if (number[i] + number[j]== target){
                   return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you wish to input: ");
        int number = input.nextInt();
        int [] nums = new int [number];

        System.out.println("Enter the Actual numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println("Enter Target: ");
        int target = input.nextInt();
        System.out.println(Arrays.toString(checkTwoSum(nums, target)));
    }
}
