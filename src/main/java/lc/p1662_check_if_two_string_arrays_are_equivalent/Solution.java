package lc.p1662_check_if_two_string_arrays_are_equivalent;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String word : word1) sb1.append(word);
        for (String word : word2) sb2.append(word);
        return sb1.toString().equals(sb2.toString());
    }
}
