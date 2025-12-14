package lc.p3760_maximum_substrings_with_distinct_start;

import java.util.HashSet;

// https://leetcode.com/problems/maximum-substrings-with-distinct-start/description/
public class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for (char ch : s.toCharArray()) set.add(ch);
        return set.size();
    }
}
