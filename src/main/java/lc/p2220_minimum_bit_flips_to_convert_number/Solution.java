package lc.p2220_minimum_bit_flips_to_convert_number;

// https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/
public class Solution {
    public int minBitFlips(int start, int goal) {
        int res = 0;
        int xor = start ^ goal;
        while (xor != 0) {
            res += xor & 1;
            xor >>= 1;
        }
        return res;
    }
}
