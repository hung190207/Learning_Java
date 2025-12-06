package lc.p2006_count_number_of_pairs_with_absolute_difference_K;

// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/
public class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
