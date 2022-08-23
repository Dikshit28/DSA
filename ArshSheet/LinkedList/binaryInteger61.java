package ArshSheet.LinkedList;

public class binaryInteger61 {
    public static int getDecimalValue(ListNode head) {
        int res = 0;
        while (head != null) {
            res = (res * 2) + head.val;
            head = head.next;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        ListNode head = ListNode.arrayToListNode(arr);
        System.out.println(getDecimalValue(head));
    }
}
