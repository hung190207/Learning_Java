package lc.p2108_find_first_palindromic_string_in_the_array;

// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
public class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word).reverse();
            if (word.equals(sb.toString())) {
                return word;
            }
        }
        return "";
    }
}
