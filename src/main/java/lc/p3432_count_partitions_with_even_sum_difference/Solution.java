package lc.p3432_count_partitions_with_even_sum_difference;

// https://leetcode.com/problems/count-partitions-with-even-sum-difference/description/
public class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i;
        int leftSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            sum -= nums[i];
            if (Math.abs(sum - leftSum) % 2 == 0) count++;
        }
        return count;
    }
}
