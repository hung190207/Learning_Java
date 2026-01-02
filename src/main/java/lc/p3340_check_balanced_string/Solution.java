package lc.p3340_check_balanced_string;

/*
 * Problem 3340
 * URL: https://leetcode.com/problems/check-balanced-string/description/
 */

public class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 0) evenSum += Integer.parseInt(String.valueOf(num.charAt(i)));
            else oddSum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        if (evenSum == oddSum) return true;
        return false;
    }
}
