package lc.p2367_number_of_arithmetic_triplets;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/number-of-arithmetic-triplets/
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int counter = 0;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        for (int num : nums) {
            if (numSet.contains(num + diff) && numSet.contains(num + 2 * diff)) {
                counter++;
            }
        }
        return counter;
    }
}
