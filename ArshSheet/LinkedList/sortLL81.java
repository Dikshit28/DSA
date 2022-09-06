package ArshSheet.LinkedList;

public class sortLL81 {
    public static ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    private static ListNode mergeSort(ListNode head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middle = getMiddle(head); // O(n)
        ListNode middleNext = middle.next;
        // disconnect and separate the left list and right list
        middle.next = null;
        // merge sort first list
        ListNode rightList = mergeSort(head); // O(logn)* n
        // merge sort second list
        ListNode leftList = mergeSort(middleNext); // O(logn) * n
        // merge both lists
        ListNode mergedList = merge(rightList, leftList);
        return mergedList;
    }

    private static ListNode merge(ListNode leftList, ListNode rightList) {
        ListNode result = null;

        if (rightList == null) {
            return leftList;
        }
        if (leftList == null) {
            return rightList;
        }

        // store smallest value into result list
        if (rightList.val <= leftList.val) {
            result = rightList;
            // increment right list
            result.next = merge(rightList.next, leftList);
        } else {
            result = leftList;
            // increment left list
            result.next = merge(rightList, leftList.next);
        }
        return result;
    }

    private static ListNode getMiddle(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;

        // as fast steps twice as many as slow, fast will reach the end as slow reaches
        // the middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 1, 4, 5 };
        ListNode head = ListNode.arrayToListNode(arr);
        ListNode hn = sortList(head);
        ListNode.printLL(hn);
    }
}
