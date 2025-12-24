package lc.p1464_maximum_product_of_two_elements_in_an_array;

import java.util.Arrays;

public class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 2] - 1) * (nums[nums.length - 1] - 1);
    }
}
