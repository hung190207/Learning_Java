package lc.p125_valid_palindrome;

// https://leetcode.com/problems/valid-palindrome/
public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            char currentleft = s.charAt((left));
            char currentright = s.charAt((right));
            if (!Character.isLetterOrDigit(currentleft)) {
                left++;
            } else if (!Character.isLetterOrDigit(currentright)) {
                right--;
            } else {
                if (Character.toLowerCase(currentleft) != Character.toLowerCase(currentright)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
