package lc.p190_reverse_bits;

// https://leetcode.com/problems/reverse-bits/
public class Solution {
    public int reverseBits(int num) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) | (num & 1);
            num >>>= 1;
        }
        return res;
    }
}
