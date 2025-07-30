/*
 Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
*/
public class Two_Sum {

    public static void main(String[] args) {
        int target = 8;
        int[] nums = { 3, 4, 5, 4, 2, 6 };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] != nums[j] && nums[i] + nums[j] == target) {
                    System.out.println("[" + i + "],[" + j + "]");
                }
            }
        }
    }

}