package lc.p1859_sorting_the_sentence;

// https://leetcode.com/problems/sorting-the-sentence/description/
public class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res = new String[words.length];
        for (String word : words) {
            int idx = Character.getNumericValue(word.charAt(word.length() - 1)) - '0';
            res[idx] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", res);
    }
}
