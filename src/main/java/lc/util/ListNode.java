package lc.util;

public class ListNode {
    public int val;
    public ListNode next;

    // Fixed: was assigning this.next to itself instead of the parameter
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;  // Changed from this.next = this.next
    }

    // Add default constructor for convenience
    public ListNode(int val) {
        this(val, null);
    }

    // Convert array into ListNode.
    public static ListNode fromArray(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;

        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    // Convert Int array into ListNode
    public static ListNode fromIntegerArray(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        ListNode head = new ListNode(array[0], null);  // Fixed: current doesn't exist yet
        ListNode current = head;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != null) {
                current.next = new ListNode(array[i], null);  // Fixed: just pass null
                current = current.next;
            }
        }

        return head;
    }

    // Convert ListNode to Array
    public int[] toArray() {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        ListNode current = this;

        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    //    Added compare result function.
    public static boolean areEqual(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            if (expected.val != actual.val) return false;
            expected = expected.next;
            actual = actual.next;
        }
        return expected == null && actual == null;
    }
}