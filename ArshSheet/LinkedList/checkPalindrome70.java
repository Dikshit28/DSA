package ArshSheet.LinkedList;

public class checkPalindrome70 {
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        // reverse the first portion during iteration
        ListNode fast = head, newHead = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        // skip the node at central place if the list contains odd number of nodes
        if (fast != null)
            head = head.next;
        while (newHead != null && head != null) {
            if (newHead.val != head.val)
                return false;
            newHead = newHead.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 5, 1 };
        ListNode head = ListNode.arrayToListNode(arr);
        System.out.println(isPalindrome(head));
    }
}
