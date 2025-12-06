package lc.p2535_difference_between_element_sum_and_digit_sum_of_an_array;

// https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
public class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int sumOfDigits = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (nums[i] != 0) {
                sumOfDigits += nums[i] % 10;
                nums[i] /= 10;
            }
        }
        return sum - sumOfDigits;
    }
}
