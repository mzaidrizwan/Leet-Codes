/*
[Contains Duplicate Checker]

Given an integer array, return true if any value appears more than once in the array, otherwise return false.

Example 1:-
Input: nums = [1, 2, 3, 3]
Output: true

Example 2:-
Input: nums = [1, 2, 3, 4]
Output: false
*/
import java.util.ArrayList;
public class Contains_Duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> record = new ArrayList<>();
        int[] arr = { 0, 2, 5, 9, 1 };
        boolean found = false;

        for (int i : arr) {
            for (int j : record) {
                if (i == j) {
                    found = true;
                    System.out.println("false");
                    break;
                }
            }

            record.add(i);

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("true");
        }
    }
}