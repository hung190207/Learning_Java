package lc.p203_remove_linked_list_elements;

import lc.util.ListNode;

// https://leetcode.com/problems/remove-linked-list-elements/description/
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode pointer = head;
        while (pointer != null && pointer.next != null) {
            if (pointer.next.val == val) {
                pointer.next = pointer.next.next;
            } else {
                pointer = pointer.next;
            }
        }
        return head;
    }
}
