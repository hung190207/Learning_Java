package lc.p3232_find_if_digit_game_can_be_won;

// https://leetcode.com/problems/find-if-digit-game-can-be-won/description/
public class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] / 10 != 0) sum2 += nums[i];
            else sum1 += nums[i];
        }
        return (!(sum1 == sum2));
    }
}
