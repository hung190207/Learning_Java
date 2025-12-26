package lc.p1588_sum_of_all_odd_length_subarrays;

// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
public class Solution {
    public int sumOddLengthSubarrays(int[] arrays) {
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += (((arrays.length - i) * (i + 1) + 1) / 2) * arrays[i];
        }
        return sum;
    }
}
