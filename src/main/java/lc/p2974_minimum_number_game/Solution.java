package lc.p2974_minimum_number_game;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-number-game/
public class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i += 2) {
            res[i] = nums[i + 1];
            res[i + 1] = nums[i];
        }
        return res;
    }
}
