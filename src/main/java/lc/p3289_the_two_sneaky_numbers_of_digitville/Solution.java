package lc.p3289_the_two_sneaky_numbers_of_digitville;

import java.util.Arrays;

// https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/
public class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[2];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                res[idx++] = nums[i];
                i++;
                if (idx == 2) {
                    break;
                }
            }
        }
        return res;
    }
}
