package lc.p2942_find_words_containing_character;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-words-containing-character/
public class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) res.add(i);
        }
        return res;
    }
}
