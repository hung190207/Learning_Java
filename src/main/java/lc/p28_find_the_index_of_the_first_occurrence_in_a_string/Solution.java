package lc.p28_find_the_index_of_the_first_occurrence_in_a_string;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
public class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}