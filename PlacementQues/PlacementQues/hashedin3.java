package PlacementQues;

import java.util.LinkedList;
import java.util.Queue;

import ArshSheet.trees.TreeNode;
import java.util.*;

public class hashedin3 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if (root == null) {
            return res;
        }
        q.offer(root);
        while (!q.isEmpty()) {
            int levelnum = q.size();
            List<Integer> sub = new LinkedList<>();
            for (int i = 0; i < levelnum; i++) {
                if (q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.offer(q.peek().right);
                }
                sub.add(q.poll().val);
            }
            res.add(sub);
        }
        return res;
    }

    static List<Integer> right = new ArrayList<>();
    static List<Integer> left = new ArrayList<>();

    public static List<Integer> preRight(TreeNode root, int level) {
        if (root == null) {
            return right;
        }
        if (right.size() == level) {
            right.add(root.val);
        }
        preRight(root.right, level + 1);
        preRight(root.left, level + 1);
        return right;
    }

    public static List<Integer> preLeft(TreeNode root, int level) {
        if (root == null) {
            return left;
        }
        if (left.size() == level) {
            left.add(root.val);
        }
        preLeft(root.left, level + 1);
        preLeft(root.right, level + 1);
        return left;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        TreeNode l11 = new TreeNode(4);
        TreeNode r11 = new TreeNode(5);
        TreeNode l12 = new TreeNode(6);
        TreeNode r12 = new TreeNode(7);
        TreeNode l21 = new TreeNode(8);
        TreeNode l31 = new TreeNode(9);
        root.left = l1;
        root.right = r1;
        l1.left = l11;
        l1.right = r11;
        r1.left = l12;
        r1.right = r12;
        l11.left = l21;
        l21.left = l31;
        /*
         ******** 1
         ***** 2*****3
         **** 4*5***6*7
         *** 8
         ** 9
         */
        List<List<Integer>> res = levelOrder(root);
        System.out.println(res);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (List<Integer> list : res) {
            left.add(list.get(0));
            right.add(list.get(list.size() - 1));
        }
        System.out.println("LEFT VIEW");
        System.out.println(left);
        System.out.println(preLeft(root, 0));
        System.out.println("RIGHT VIEW");
        System.out.println(right);
        System.out.println(preRight(root, 0));
    }
}
