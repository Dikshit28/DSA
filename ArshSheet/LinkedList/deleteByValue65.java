package ArshSheet.LinkedList;

public class deleteByValue65 {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4 };
        int val = 2;
        ListNode head = ListNode.arrayToListNode(arr);
        head = removeElements(head, val);
        ListNode.printLL(head);
    }
}
