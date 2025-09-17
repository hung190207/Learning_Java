package lc.p58_length_of_last_word;

//https://leetcode.com/problems/length-of-last-word/
public class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int last = s.length() - 1;
//        run from the last word to get it length
        while (last >= 0) {
            if (s.charAt(last) == ' ' && count != 0) {
                break;
//                for some test case end with space
            } else if (s.charAt(last) != ' ') {
                count++;
            }
            last--;
        }
        return count;
    }

}
