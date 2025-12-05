package lc.p3427_sum_of_variable_length_subarrays;

// https://leetcode.com/problems/sum-of-variable-length-subarrays/description/
public class Solution {
    public int subarraySum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = Math.max(0, i - nums[i]);
            for (int k = j; k <= i; k++) {
                sum += nums[k];
            }
        }
        return sum;
    }
}
