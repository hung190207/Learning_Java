package lc.p1769_minimum_number_of_operations_to_move_all_balls_to_each_box;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/
public class Solution {
    public int[] minOperations(String boxes) {
        List<Integer> position = new ArrayList<>();
        int[] res = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                position.add(i);
            }
        }
        for (int i = 0; i < boxes.length(); i++) {
            int sum = 0;
            for (int j : position) {
                int moves = Math.abs(i - j);
                sum += moves;
            }
            res[i] = sum;
        }
        return res;
    }
}