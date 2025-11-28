package lc.p1816_truncate_sentence;

// https://leetcode.com/problems/truncate-sentence/description/
public class Solution {
    public String truncateSentence(String s, int k) {
        if (s.length() <= k) return s;
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = 0; i < k; i++) {
            if (i > 0) sb.append(' ');
            sb.append(words[i]);
        }
        return sb.toString();
    }
}
