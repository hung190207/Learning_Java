package lc.p13_roman_to_integer;

// https://leetcode.com/problems/roman-to-integer/
public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int temp = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    temp = 1;
                    break;
                case 'V':
                    temp = 5;
                    break;
                case 'X':
                    temp = 10;
                    break;
                case 'L':
                    temp = 50;
                    break;
                case 'C':
                    temp = 100;
                    break;
                case 'D':
                    temp = 500;
                    break;
                case 'M':
                    temp = 1000;
                    break;

            }
            if (4 * temp < result) {
                result -= temp;
//          for some specific roman numerals such as IV, XC, ...
            } else {
                result += temp;
            }
        }
        return result;
    }

}
