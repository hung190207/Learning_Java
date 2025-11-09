package lc.p2161_partition_array_according_to_given_pivot;

// https://leetcode.com/problems/partition-array-according-to-given-pivot/
public class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int idx = 0;
        for (int num : nums) {
            if (num < pivot) {
                res[idx++] = num;
            }
        }
        for (int num : nums) {
            if (num == pivot) {
                res[idx++] = num;
            }
        }
        for (int num : nums) {
            if (num > pivot) {
                res[idx++] = num;
            }
        }
        return res;
    }
}
