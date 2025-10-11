package nc.contains_duplicate;

import java.util.Arrays;

// https://neetcode.io/problems/duplicate-integer?list=neetcode150
public class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
