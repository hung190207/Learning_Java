package lc.p2206_divide_array_into_equal_pairs;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/divide-array-into-equal-pairs/description/
public class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for (int num : nums) {
            if (!(res.add(num))) {
                res.remove(num);
            }
        }
        return res.isEmpty();
    }
}
