package lc.p496_next_greater_element_I;

// https://leetcode.com/problems/next-greater-element-i/
public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int temp = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    if (j + 1 > nums2.length - 1) {
                        break;
                    }
                    if (nums2[j + 1] > nums2[j]) {
                        temp = nums2[j + 1];
                    } else {
                        for (int k = j + 1; k < nums2.length; k++) {
                            if (nums2[k] > nums1[i]) {
                                temp = nums2[k];
                                break;
                            }
                        }
                    }
                }
            }
            ans[i] = temp;
        }
        return ans;
    }
}
