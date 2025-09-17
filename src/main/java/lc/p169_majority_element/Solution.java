package lc.p169_majority_element;

import java.util.Arrays;

// https://leetcode.com/problems/majority-element/
public class Solution {
    public int MajorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len / 2];
//        find the middle number in array. Because the majority number always occur more than n/2 times, so it's position will be present at index n/2.
    }
}
