package lc.p3162_find_the_number_of_good_pairs_I;

// https://leetcode.com/problems/find-the-number-of-good-pairs-i/description/
public class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int res = 0;
        for (int val1 : nums1) {
            for (int val2 : nums2) {
                if (val1 % (val2 * k) == 0) res++;
            }
        }
        return res;
    }
}
