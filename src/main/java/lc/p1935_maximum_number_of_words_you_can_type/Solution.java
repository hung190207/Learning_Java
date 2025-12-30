package lc.p1935_maximum_number_of_words_you_can_type;

// https://leetcode.com/problems/maximum-number-of-words-you-can-type/
public class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] temp = text.split(" ");
        int count = 0;
        for (String str : temp) {
            boolean canType = true;
            for (char c : brokenLetters.toCharArray()) {
                if (str.indexOf(c) != -1) {
                    canType = false;
                    break;
                }
            }
            if (canType) count++;
        }
        return count;
    }
}
