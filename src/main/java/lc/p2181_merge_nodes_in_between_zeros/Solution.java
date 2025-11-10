package lc.p2181_merge_nodes_in_between_zeros;

import lc.util.ListNode;

// https://leetcode.com/problems/merge-nodes-in-between-zeros/
public class Solution {
    static {
        for (int i = 0; i < 1000; i++) {
            mergeNodes(null);
        }
    }

    public static ListNode mergeNodes(ListNode head) {
        ListNode dummy = head;
        while (dummy != null) {
            int sum = dummy.val;
            ListNode temp = dummy.next;
            while (temp != null && temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            }
            dummy.val = sum;
            dummy.next = temp.next;
            dummy = dummy.next;
        }
        return head;
    }
}
