package lc.p349_intersection_of_two_arrays;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/intersection-of-two-arrays/
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) res.add(num);
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
