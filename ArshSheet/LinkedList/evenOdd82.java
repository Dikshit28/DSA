package ArshSheet.LinkedList;

public class evenOdd82 {
    public static ListNode evenOdd(ListNode head) {

        ListNode evenStart = null;
        ListNode evenEnd = null;
        ListNode oddStart = null;
        ListNode oddEnd = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            int element = currentNode.val;

            if (element % 2 == 0) {

                if (evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = currentNode;
                    evenEnd = evenEnd.next;
                }

            } else {

                if (oddStart == null) {
                    oddStart = currentNode;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = currentNode;
                    oddEnd = oddEnd.next;
                }
            }
            // Move head pointer one step in forward direction
            currentNode = currentNode.next;
        }

        if (oddStart == null || evenStart == null) {
            return head;
        }

        evenEnd.next = oddStart;
        oddEnd.next = null;
        return evenStart;
    }

    public static void main(String[] args) {
        int[] arr = { 17, 15, 8, 12, 10, 5, 4, 1, 7, 6 };
        ListNode head = ListNode.arrayToListNode(arr);
        ListNode hn = evenOdd(head);
        ListNode.printLL(hn);
    }
}
