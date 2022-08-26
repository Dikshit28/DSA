package ArshSheet.LinkedList;

public class addTwo72 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode res = new ListNode(0);
        ListNode d = res;
        int sum = 0;
        while (temp1 != null || temp2 != null) {
            sum /= 10;
            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return res.next;
    }

    public static void main(String[] args) {
        int[] arr1 = { 9, 9, 9, 9, 9, 9, 9 };
        int[] arr2 = { 9, 9, 9, 9 };
        ListNode l1 = ListNode.arrayToListNode(arr1);
        ListNode l2 = ListNode.arrayToListNode(arr2);
        ListNode hn = addTwoNumbers(l1, l2);
        ListNode.printLL(hn);
    }
}
