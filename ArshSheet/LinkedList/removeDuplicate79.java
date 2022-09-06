package ArshSheet.LinkedList;

public class removeDuplicate79 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0), fast = head, slow = dummy;
        slow.next = fast;
        while (fast != null) {
            while (fast.next != null && fast.val == fast.next.val) {
                fast = fast.next; // while loop to find the last node of the dups.
            }
            if (slow.next != fast) { // duplicates detected.
                slow.next = fast.next; // remove the dups.
                fast = slow.next; // reposition the fast pointer.
            } else { // no dup, move down both pointer.
                slow = slow.next;
                fast = fast.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 4, 4, 5 };
        ListNode head = ListNode.arrayToListNode(arr);
        ListNode hn = deleteDuplicates(head);
        ListNode.printLL(hn);
    }
}
