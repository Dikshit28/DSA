package ArshSheet.LinkedList;

public class deleteByPointer69 {
    public static void deleteByPointer(ListNode pointer) {
        if (pointer != null && pointer.next == null) {
            pointer = null;
        }
        ListNode temp = pointer.next;
        pointer.val = temp.val;
        pointer.next = temp.next;
        temp = null;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ListNode head = ListNode.arrayToListNode(arr);
        ListNode temp = new ListNode(5);
        ListNode pointer = new ListNode(10, temp);
        ListNode temp2 = head;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = pointer;
        deleteByPointer(pointer);
        ListNode.printLL(head);
    }
}
