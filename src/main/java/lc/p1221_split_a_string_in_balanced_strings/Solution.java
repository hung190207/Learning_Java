package lc.p1221_split_a_string_in_balanced_strings;

// https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
public class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int rcount = 0;
        int lcount = 0;

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == 'R') {
                rcount++;
            }
            if (curr == 'L') {
                lcount++;
            }
            if (rcount == lcount) {
                count++;
                lcount = 0;
                rcount = 0;
            }
        }
        return count;
    }
}
