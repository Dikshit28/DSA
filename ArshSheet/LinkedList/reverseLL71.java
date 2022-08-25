package ArshSheet.LinkedList;

public class reverseLL71 {
    public static ListNode reverseList(ListNode head) {
        /* iterative solution */
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public static ListNode reverseList1(ListNode head) {
        /* recursive solution */
        return reverseListInt(head, null);
    }

    private static ListNode reverseListInt(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        ListNode head = ListNode.arrayToListNode(arr);
        ListNode.printLL(reverseList(head));
        head = ListNode.arrayToListNode(arr);
        ListNode.printLL(reverseList1(head));
    }
}
