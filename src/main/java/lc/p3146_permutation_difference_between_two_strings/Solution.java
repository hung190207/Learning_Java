package lc.p3146_permutation_difference_between_two_strings;


// https://leetcode.com/problems/permutation-difference-between-two-strings/description/
public class Solution {
    public int findPermutationDifference(String s, String t) {
        int diff = 0;
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            int j = t.indexOf(str);
            diff += Math.abs(j - i);
        }
        return diff;
    }
}
