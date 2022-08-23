package ArshSheet.LinkedList;

public class middleNode59 {

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        ListNode hn = middleNode(ListNode.arrayToListNode(arr));
        ListNode.printLL(hn);
    }
}
