package lc.p1227_airplane_seat_assignment_probability;

// https://leetcode.com/problems/airplane-seat-assignment-probability/
public class Solution {
    public double nthPersonGetsNthSeat(int n) {
        if (n == 1) return 1;
        return 0.5;
    }
}
