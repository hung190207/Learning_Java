package lc.p3264_final_array_state_after_K_multiplication_operations_I;

// https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/description/
public class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    idx = j;
                }
            }
            nums[idx] *= multiplier;
        }
        return nums;
    }
}
