package lc.p1108_defanging_an_ip_address;

// https://leetcode.com/problems/defanging-an-ip-address/solutions/7301482/one-line-solution-java-beats-10000-by-ve-2dmu/
public class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
