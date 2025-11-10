package lc.p3701_compute_alternating_sum;

// https://leetcode.com/problems/compute-alternating-sum/description/
public class Solution {
    public int alternatingSum(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0) res += nums[i];
            else res -= nums[i];
        }
        return res;
    }
}
