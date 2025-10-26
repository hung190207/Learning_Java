package lc.p338_counting_bits;

// https://leetcode.com/problems/counting-bits/description/
public class Solution {
    public static int[] countBits(int num) {
        int[] res = new int[num + 1];
        for(int i = 1; i <= num; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }
}
