package lc.p26_remove_duplicates_from_sorted_array;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = 4864;
            }
        }
        Arrays.sort(nums);
        for (int num : nums) {
            if (num == 4864) {
                break;
            }
            result++;
        }
        return result;
    }
}
