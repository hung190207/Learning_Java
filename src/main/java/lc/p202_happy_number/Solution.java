package lc.p202_happy_number;

// https://leetcode.com/problems/happy-number/
public class Solution {
    public boolean isHappy(int n) {
        if (n == 1 || n == 7) {
            return true;
        } else if (n < 10) {
            return false;
        } else {
            int sum = 0;
            while (n > 0) {
                int temp = n % 10;
                sum = (int) (sum + Math.pow(temp, 2));
                n = n / 10;
            }
            return isHappy(sum);
        }
    }
}
