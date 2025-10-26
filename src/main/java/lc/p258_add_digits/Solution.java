package lc.p258_add_digits;

// https://leetcode.com/problems/add-digits/
public class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        else if (num % 9 == 0) return 9;
        else return num % 9;
    }
}
