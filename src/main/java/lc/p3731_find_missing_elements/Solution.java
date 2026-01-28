package lc.p3731_find_missing_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-missing-elements/description/
public class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 1) {
                for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                    res.add(j);
                }
            }
        }
        return res;
    }
}
