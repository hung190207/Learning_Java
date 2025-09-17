package lc.p69_sqrt;

// https://leetcode.com/problems/sqrtx/
public class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int l = 1, r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if
            (mid == x / mid) {
//                check if mid * mid = x
                return mid;
            } else if
            (mid < x / mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return r;
    }
}
