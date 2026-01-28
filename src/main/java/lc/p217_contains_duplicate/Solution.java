package lc.p217_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for (int num : nums) {
            if (res.contains(num)) return true;
            res.add(num);
        }
        return false;
    }
}
