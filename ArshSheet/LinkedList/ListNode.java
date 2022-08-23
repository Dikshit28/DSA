package ArshSheet.LinkedList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode arrayToListNode(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            ListNode new_node = new ListNode();
            new_node.val = arr[i];
            ListNode temp = new ListNode();
            temp = head;
            if (head == null) {
                head = new_node;
            } else {
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new_node;
            }
        }
        return head;
    }

    public static void printLL(ListNode hn) {
        while (hn.next != null) {
            System.out.print(hn.val + ">");
            hn = hn.next;
        }
        System.out.println(hn.val);
    }
}