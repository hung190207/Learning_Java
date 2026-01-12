package lc.p2114_maximum_number_of_words_found_in_sentences;

// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
public class Solution {
    public int mostWordsFound(String[] sentences) {
        int res = 0;
        for (int i = 0; i < sentences.length; i++) {
            int count = 0;
            String[] temp = sentences[i].split(" ");
            for (String s : temp) {
                count++;
            }
            if (res < count) res = count;
        }
        return res;
    }
}
