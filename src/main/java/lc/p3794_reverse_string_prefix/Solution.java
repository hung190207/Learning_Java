package lc.p3794_reverse_string_prefix;

// https://leetcode.com/problems/reverse-string-prefix/description/
public class Solution {
    public String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0;
        k--;
        while (i < k) {
            char temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            i++;
            k--;
        }
        return new String(arr);
    }
}
