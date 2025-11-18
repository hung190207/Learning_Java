package lc.p2574_left_and_right_sum_differences;

// https://leetcode.com/problems/left-and-right-sum-differences/description/
public class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        int sum2 = 0;
        int[] res = new int[nums.length];
        for (int x : nums) {
            sum += x;
        }
        for (int i = 0; i < nums.length; i++) {
            int rightSum = sum - nums[i] - sum2;
            int leftSum = sum2;
            res[i] = Math.abs(rightSum - leftSum);
            sum2 += nums[i];
        }
        return res;
    }
}
