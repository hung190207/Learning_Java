package lc.p3498_reverse_degree_of_a_string;

// https://leetcode.com/problems/reverse-degree-of-a-string/
public class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int position = i + 1;
            int reverseVal = 'z' - s.charAt(i) + 1;
            res += (position * reverseVal);
        }
        return res;
    }
}
