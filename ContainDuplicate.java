package LeetCode;

import java.util.Scanner;

public class ContainDuplicate {
    public static boolean checkDuplicate(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    return true;
                }
            }

        }
        return false;
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

        System.out.println(checkDuplicate(nums));
    }
}
