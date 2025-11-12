package lc.p1431_kids_with_the_greatest_number_of_candies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        OptionalInt max = Arrays.stream(candies).max();
        for (int candy : candies) {
            if (candy + extraCandies >= max.getAsInt()) res.add(true);
            else res.add(false);
        }
        return res;
    }
}
