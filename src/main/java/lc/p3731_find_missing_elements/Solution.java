package lc.p3731_find_missing_elements;

import java.util.*;

// https://leetcode.com/problems/find-missing-elements/description/
public class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        int min = nums[0], max = nums[1];
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
            set.add(num);
        }
        for (int i = min; i < max; i++) {
            if (!set.contains(i)) res.add(i);
        }
        return res;
    }
}
