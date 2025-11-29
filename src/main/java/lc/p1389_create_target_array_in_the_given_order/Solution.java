package lc.p1389_create_target_array_in_the_given_order;

public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = size; j > index[i]; j--) {
                res[j] = res[j - 1];
            }
            res[index[i]] = nums[i];
            size++;
        }
        return res;
    }
}
