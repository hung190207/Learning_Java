package lc.p1342_number_of_steps_to_reduce_a_number_to_zero;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                steps++;
                num /= 2;
            } else {
                num -= 1;
                steps++;
            }
        }
        return steps;
    }
}
