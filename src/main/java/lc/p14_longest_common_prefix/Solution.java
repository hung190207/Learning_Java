package lc.p14_longest_common_prefix;

import java.util.Arrays;

// https://leetcode.com/problems/longest-common-prefix/
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String begin = strs[0];
        String end = strs[strs.length - 1];
        int index = 0;
        while (index < begin.length() && index < end.length()) {
            if (begin.charAt(index) == end.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return begin.substring(0, index);
    }
}
