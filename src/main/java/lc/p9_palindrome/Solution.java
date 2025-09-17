package lc.p9_palindrome;

// https://leetcode.com/problems/palindrome-number/
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }
        String pn = x + "";
        StringBuilder temp = new StringBuilder();
        for (int i = pn.length() - 1; i >= 0; i--) {
            temp.append(pn.charAt(i));
            if (temp.toString().equals(pn)) {
                return true;
            }
        }
        return false;
    }
}