package lc.p191_number_of_1_bits;

// https://leetcode.com/problems/number-of-1-bits/description/
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
