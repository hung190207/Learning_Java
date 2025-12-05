package lc.p2520_count_the_digits_that_divide_a_number;

// https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/
public class Solution {
    public int countDigits(int num) {
        int c = 0, val = 0, k = num;
        while (num > 0) {
            val = num % 10;
            num /= 10;
            if (k % val == 0) {
                c++;
            }
        }
        return c;
    }
}
