package lc.p3541_find_most_frequent_vowel_and_consonant;

// https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/description/
public class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int maxVowel = 0, maxConsonant = 0;
        for (char c : s.toCharArray()) {
            int i = c - 'a';
            freq[i]++;
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o') {
                maxVowel = Math.max(maxVowel, freq[i]);
            } else {
                maxConsonant = Math.max(maxConsonant, freq[i]);
            }
        }
        return maxVowel + maxConsonant;
    }
}
