package ArshSheet.LinkedList;

public class mergeSorted66 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(0);
        ListNode last = preHead;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                last.next = l2;
                l2 = l2.next;
            } else {
                last.next = l1;
                l1 = l1.next;
            }
            last = last.next;
        }

        if (l1 == null) {
            last.next = l2;
        } else {
            last.next = l1;
        }

        return preHead.next;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4 };
        int[] arr2 = { 2, 3, 5 };
        ListNode h1 = ListNode.arrayToListNode(arr1);
        ListNode h2 = ListNode.arrayToListNode(arr2);
        ListNode head = mergeTwoLists(h1, h2);
        ListNode.printLL(head);
    }
}
