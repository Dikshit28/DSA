package ArshSheet.LinkedList;

public class rearrange83 {
    public static ListNode rearrange(ListNode head) {

        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        ListNode head = ListNode.arrayToListNode(arr);
        ListNode hn = rearrange(head);
        ListNode.printLL(hn);
    }
}
