package lc.p1281_subtract_the_product_and_sumof_digits_of_an_integer;

// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n != 0) {
            int num = n % 10;
            n = n / 10;
            product *= num;
            sum += num;
        }
        return product - sum;
    }
}
