package lc.util;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = next;
    }
    // Convert ListNode into array.
    public static ListNode fromArray(int[] arr) {
        if (arr == null || arr.length == 0)
            return null;
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }
    // Convert ListNode to Integer Array
    public static ListNode fromIntegerArray(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        ListNode head = new ListNode(array[0]);
        ListNode current = head;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != null) {
                current.next = new ListNode(array[i]);
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

    /*public void ListNodeArray(int[] arr, int val){
        this.val = val;
    }*/
}
