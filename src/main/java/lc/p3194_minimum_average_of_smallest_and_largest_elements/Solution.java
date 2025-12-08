package lc.p3194_minimum_average_of_smallest_and_largest_elements;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/description/
public class Solution {
    public double minimumAverage(int[] nums) {
        int start = 0, end = nums.length - 1;
        Arrays.sort(nums);
        double res = (double) (nums[start] + nums[end]) / 2;
        while (start <= end) {
            res = Math.min(res, ((double) (nums[start] + nums[end]) / 2));
            start++;
            end--;
        }
        return res;
    }
}
