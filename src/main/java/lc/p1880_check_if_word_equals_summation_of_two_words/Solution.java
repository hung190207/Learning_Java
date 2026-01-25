package lc.p1880_check_if_word_equals_summation_of_two_words;

// https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/description/
public class Solution {
    private static int getNumberAlphabets(char[] chars) {
        int num = 0;
        for (char c : chars) {
            num = num * 10 + (c - 'a');
        }
        return num;
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return (getNumberAlphabets(firstWord.toCharArray()) + getNumberAlphabets(secondWord.toCharArray()) == getNumberAlphabets(targetWord.toCharArray()));
    }
}
