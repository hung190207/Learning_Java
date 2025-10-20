package lc.p205_isomorphic_strings;

// https://leetcode.com/problems/isomorphic-strings/description/
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] inT = new int[200];
        int[] inS = new int[200];
        int len = s.length();
        if (len != t.length()) return false;
        for (int i = 0; i < len; i++) {
            if (inS[s.charAt(i)] != inT[t.charAt(i)]) return false;
            inS[s.charAt(i)] = i + 1;
            inT[t.charAt(i)] = i + 1;

        }
        return true;
    }
}
