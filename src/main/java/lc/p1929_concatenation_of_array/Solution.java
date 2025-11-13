package lc.p1929_concatenation_of_array;

// https://leetcode.com/problems/concatenation-of-array/description/
public class Solution {
    public int[] getConcatenation(int[] nums) {
        var n = nums.length;
        var ans = new int[2 * n];
        for (int i = 0; i < n * 2; i++) {
            ans[i] = nums[i % n];
        }
        return ans;
    }
}
