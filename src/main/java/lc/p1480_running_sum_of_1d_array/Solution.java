package lc.p1480_running_sum_of_1d_array;

// https://leetcode.com/problems/running-sum-of-1d-array/description/
public class Solution {
    public int[] runningSum(int[] nums) {
        int sum = nums[0];
        int[] result = new int[nums.length];
        result[0] = sum;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}
