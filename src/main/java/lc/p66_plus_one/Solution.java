package lc.p66_plus_one;

// https://leetcode.com/problems/plus-one/
public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return digits;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
//                make the [x,9] become [x+1,0]
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
//        to make sure if the [9,9,9,9] array turn into [1,0,0,0,0]
    }

}
