package ArshSheet.LinkedList;

public class removeDuplicate62 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode node = head;
        while (node != null) {
            ListNode next = node.next;
            // del right same node
            while (next != null && node.val == next.val) {
                next = next.next;
            }
            node.next = next;
            node = node.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 3 };
        ListNode head = ListNode.arrayToListNode(arr);
        ListNode hn = deleteDuplicates(head);
        ListNode.printLL(hn);
    }
}
