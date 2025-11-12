package lc.p2433_find_the_original_array_of_prefix_xor;

// https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/
public class Solution {
    public int[] findArray(int[] pref) {
        if (pref.length == 1 || pref.length == 0) return pref;
        int[] res = new int[pref.length];
        res[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            res[i] = pref[i - 1] ^ pref[i];
        }
        return res;
    }
}
