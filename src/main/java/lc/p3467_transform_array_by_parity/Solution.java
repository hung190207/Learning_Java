package lc.p3467_transform_array_by_parity;

import java.util.Arrays;

// https://leetcode.com/problems/transform-array-by-parity/
public class Solution {
    public int[] transformArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}
