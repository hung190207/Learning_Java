package lc.p2807_insert_greatest_common_divisors_in_linked_list;

import lc.util.ListNode;

// https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/
public class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        for (ListNode curr = head; curr != null && curr.next != null; curr = curr.next.next) {
            int a = curr.val, b = curr.next.val;
            while (b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;
            }
            curr.next = new ListNode(a, curr.next);
        }
        return head;
    }
}
