package ArshSheet.LinkedList;

public class zigzagLL80 {
    public static void zigzag(ListNode head) {
        boolean flag = true;
        int temp;
        ListNode current = head;
        while (current != null && current.next != null) {
            if (flag == true) /* "<" relation expected */
            {
                /*
                 * If we have a situation like A > B > C
                 * where A, B and C are consecutive Nodes
                 * in list we get A > B < C by swapping B
                 * and C
                 */
                if (current.val > current.next.val) {
                    temp = current.val;
                    current.val = current.next.val;
                    current.next.val = temp;
                }
            } else /* ">" relation expected */
            {
                /*
                 * If we have a situation like A < B < C where
                 * A, B and C are consecutive Nodes in list we
                 * get A < C > B by swapping B and C
                 */
                if (current.val < current.next.val) {
                    temp = current.val;
                    current.val = current.next.val;
                    current.next.val = temp;
                }
            }

            current = current.next;

            /* flip flag for reverse checking */
            flag = !(flag);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 11, 15, 20, 5, 10 };
        ListNode head = ListNode.arrayToListNode(arr);
        zigzag(head);
        ListNode.printLL(head);
    }
}
