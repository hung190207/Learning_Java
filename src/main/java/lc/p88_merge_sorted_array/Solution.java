package lc.p88_merge_sorted_array;

// https://leetcode.com/problems/merge-sorted-array/
public class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
//        on the leetcode their function is "void merge" but I'll make it return int[] to write testcase.
        if (n == 0) {
            return nums1;
        }
        int n1 = nums1.length;
        int end_index = n1 - 1;
        while (n > 0 && m > 0) {
            if (nums2[n - 1] >= nums1[m - 1]) {
                nums1[end_index] = nums2[n - 1];
                n--;
            } else {
                nums1[end_index] = nums1[m - 1];
                m--;
            }
            end_index--;
        }
        while (n > 0) {
            nums1[end_index] = nums2[n - 1];
            n--;
            end_index--;
        }
        return nums1;
//        So you don't need to put this line on the solution.
    }
}
