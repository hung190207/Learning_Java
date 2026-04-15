package lc.p977_squares_of_a_sorted_array;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/squares-of-a-sorted-array/
public class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1, pos = nums.length - 1;
        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                res[pos] = leftSq;
                left++;
            } else {
                res[pos] = rightSq;
                right--;
            }
            pos--;
        }
        return res;
    }
}
