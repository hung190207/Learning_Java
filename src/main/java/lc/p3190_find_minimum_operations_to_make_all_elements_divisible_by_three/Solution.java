package lc.p3190_find_minimum_operations_to_make_all_elements_divisible_by_three;

// https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/
public class Solution {
    public int minimumOperations(int[] nums) {
        if (nums.length == 0) return 0;
        int countOp = 0;
        for (int num : nums) {
            if (num % 3 != 0) countOp++;
        }
        return countOp;
    }
}
