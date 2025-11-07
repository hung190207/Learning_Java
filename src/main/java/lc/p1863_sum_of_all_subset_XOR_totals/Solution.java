package lc.p1863_sum_of_all_subset_XOR_totals;

// https://leetcode.com/problems/sum-of-all-subset-xor-totals/
public class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum |= num;
        }
        return sum * (1 << (n - 1));
    }
}
