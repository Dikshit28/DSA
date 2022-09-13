package ArshSheet.trees;

import java.util.*;

public class zigzagTraversal101 {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if (root == null)
            return wrapList;
        boolean check = true;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);
                if (check) {
                    subList.add(queue.poll().val);
                } else {
                    subList.add(0, queue.poll().val);
                }
            }
            check = !check;
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
        // TreeNode l21 = new TreeNode(8);
        // TreeNode l31 = new TreeNode(9);
        root.left = l1;
        root.right = r1;
        l1.left = l11;
        l1.right = r11;
        r1.left = l12;
        r1.right = r12;
        // l11.left = l21;
        // l21.left = l31;
        System.out.println(zigzagLevelOrder(root));
    }
}
