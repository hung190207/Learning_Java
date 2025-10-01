package lc.p326_power_of_three;

// https://leetcode.com/problems/power-of-three/description/
public class Solution {
    public boolean isPowerOfThree(int num) {
        if (num == 0) {
            return false;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        return num == 1;
    }
}
