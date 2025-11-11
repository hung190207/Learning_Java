package lc.p1470_shuffle_the_array;

// https://leetcode.com/problems/shuffle-the-array/
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[pointer];
            pointer++;
            i++;
            res[i] = nums[n];
            n++;
        }
        return res;
    }
}
