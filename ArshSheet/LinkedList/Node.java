package ArshSheet.LinkedList;

public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public static Node arrayToListNode(int[] arr) {
        Node head = new Node(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            Node new_node = new Node(arr[i]);
            Node temp = head;
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

    public static void printLL(Node hn) {
        while (hn.next != null) {
            System.out.print(hn.val + ">");
            hn = hn.next;
        }
        System.out.println(hn.val);
    }
}