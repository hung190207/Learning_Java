package lc.p3512_minimum_operations_to_make_array_sum_divisible_by_K;

// https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/
public class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum % k;
    }
}
