package ArshSheet.LinkedList;

public class sortLinkedList64 {
    public static ListNode sort(ListNode head) {
        int[] count = { 0, 0, 0 };
        ListNode temp = head;
        while (temp != null) {
            count[temp.val]++;
            temp = temp.next;
        }
        int i = 0;
        temp = head;
        while (head != null) {
            if (count[i] == 0) {
                i++;
            } else {
                head.val = i;
                head = head.next;
                count[i]--;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 1, 0, 2, 1 };
        ListNode head = ListNode.arrayToListNode(arr);
        ListNode hn = sort(head);
        ListNode.printLL(hn);
    }
}
