package ArshSheet.LinkedList;

public class detectCycle60 {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 0, -4 };
        ListNode head = ListNode.arrayToListNode(arr);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head.next;
        System.out.println(hasCycle(head));
    }
}
