package lc.p12_integer_to_roman;

// https://leetcode.com/problems/integer-to-roman/description/
public class Solution {
    public String intToRoman(int num) {
        String[] unit = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] dozen = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = {"", "M", "MM", "MMM"};
        return thousands[num / 1000] + hundreds[(num % 1000) / 100] + dozen[(num % 100) / 10] + unit[num % 10];
    }
}
