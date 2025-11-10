package lc.p2044_count_number_of_maximum_bitwise_or_subsets;

// https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/description/
public class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOR = 0;
        for (int num : nums) {
            maxOR |= num;
        }
        return backtrack(nums, maxOR, 0, 0);
    }

    private int backtrack(int[] nums, int maxOR, int idx, int currOR) {
        if (idx == nums.length) {
            return currOR == maxOR ? 1 : 0;
        }
        if (currOR == maxOR) return 1 << (nums.length - idx);
        return backtrack(nums, maxOR, idx + 1, currOR | nums[idx]) +
                backtrack(nums, maxOR, idx + 1, currOR);
    }
}
