package lc.p1346_check_if_N_and_its_double_exist;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) return true;
            set.add(num);
        }
        return false;
    }
}
