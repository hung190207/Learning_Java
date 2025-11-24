package lc.p2037_minimum_number_of_moves_to_seat_everyone;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/
public class Solution {
    public int minMovesToSeat(int[] seats, int[] student) {
        Arrays.sort(seats);
        Arrays.sort(student);
        int res = 0;

        for (int i = 0; i < seats.length; i++) {
            res += Math.abs(student[i] - seats[i]);
        }
        return res;
    }
}
