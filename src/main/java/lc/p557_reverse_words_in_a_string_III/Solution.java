package lc.p557_reverse_words_in_a_string_III;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class Solution {
    public String reverseWords(String s) {
        String[] string = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < string.length; i++) {
            StringBuilder sb = new StringBuilder(string[i]);
            res.append(sb.reverse());
            if (i < string.length - 1) {
                res.append(" ");
            }
        }
        return res.toString();
    }
}