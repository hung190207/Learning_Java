package lc.p389_find_the_difference;

// https://leetcode.com/problems/find-the-difference/
public class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        int i = 0;
        for (i = 0; i < s.length(); i++) {
            sum += (t.charAt(i) - s.charAt(i));
        }
        sum += t.charAt(i);
        return (char) (sum);
    }
}