package lc.p1486_XOR_operation_in_an_array;

// https://leetcode.com/problems/xor-operation-in-an-array/description/
public class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        nums[0] = start;
        int res = 0;
        for (int i = 1; i < n; i++) {
            nums[i] = start + 2 * i;
        }
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}
