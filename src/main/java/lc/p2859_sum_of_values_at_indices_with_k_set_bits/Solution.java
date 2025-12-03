package lc.p2859_sum_of_values_at_indices_with_k_set_bits;

import java.util.List;

// https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/description/
public class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int c = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) {
                c += nums.get(i);
            }
        }
        return c;
    }
}
