package ArshSheet.trees;

import java.util.*;

public class TreeTraversals {
    public static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + ",");
        preorder(root.left);
        preorder(root.right);
    }

    public static List<Integer> preorderIterative(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        if (root == null)
            return preorder;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            root = st.pop();
            preorder.add(root.val);
            if (root.right != null)
                st.push(root.right);
            if (root.left != null)
                st.push(root.left);
        }
        return preorder;
    }

    public static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + ",");
    }

    public static List<Integer> postorderIterative(TreeNode root) {
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        List<Integer> postorder = new ArrayList<Integer>();
        if (root == null)
            return postorder;
        st1.push(root);
        while (!st1.isEmpty()) {
            root = st1.pop();
            st2.add(root);
            if (root.left != null)
                st1.push(root.left);
            if (root.right != null)
                st1.push(root.right);
        }
        while (!st2.isEmpty()) {
            postorder.add(st2.pop().val);
        }
        return postorder;
    }

    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + ",");
        inorder(root.right);
    }

    public static List<Integer> inorderIterative(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        if (root == null)
            return inorder;
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        while (true) {
            if (node != null) {
                st.push(node);
                node = node.left;
            } else {
                if (st.isEmpty()) {
                    break;
                }
                node = st.pop();
                inorder.add(node.val);
                node = node.right;
            }

        }
        return inorder;
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if (root == null)
            return wrapList;

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        TreeNode l11 = new TreeNode(4);
        TreeNode r11 = new TreeNode(5);
        TreeNode l12 = new TreeNode(6);
        TreeNode r12 = new TreeNode(7);
        root.left = l1;
        root.right = r1;
        l1.left = l11;
        l1.right = r11;
        r1.left = l12;
        r1.right = r12;
        System.out.println("PreOrder");
        preorder(root);
        System.out.println();
        System.out.println("PostOrder");
        postorder(root);
        System.out.println();
        System.out.println("InOrder");
        inorder(root);
        System.out.println();
        System.out.println("LevelOrder");
        List<List<Integer>> ls = levelOrder(root);
        System.out.println(ls);
        System.out.println("PreOrder iterative");
        List<Integer> pre = preorderIterative(root);
        System.out.println(pre);
        System.out.println("PostOrder iterative");
        List<Integer> post = postorderIterative(root);
        System.out.println(post);
        System.out.println("PostOrder iterative Single Stack");
        // List<Integer> postsingle = postorderIterative2(root);
        // System.out.println(postsingle);
        System.out.println("InOrder iterative");
        List<Integer> in = inorderIterative(root);
        System.out.println(in);
    }
}
