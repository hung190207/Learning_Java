package lc.p27_remove_element;

//https://leetcode.com/problems/remove-element/
public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int result = 0;
        while (i < nums.length) {
            if (nums[i++] != val) {
                nums[result++] = nums[i - 1];
            }
        }
        return result;
    }
}
