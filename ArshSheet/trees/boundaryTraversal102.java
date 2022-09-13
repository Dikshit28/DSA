package ArshSheet.trees;

import java.util.*;

public class boundaryTraversal102 {

    static void addLeftBoundary(TreeNode root, ArrayList<Integer> res) {
        TreeNode cur = root.left;
        while (cur != null) {
            if (isLeaf(cur) == false)
                res.add(cur.val);
            if (cur.left != null)
                cur = cur.left;
            else
                cur = cur.right;
        }
    }

    static void addRightBoundary(TreeNode root, ArrayList<Integer> res) {
        TreeNode cur = root.right;
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        while (cur != null) {
            if (isLeaf(cur) == false)
                tmp.add(cur.val);
            if (cur.right != null)
                cur = cur.right;
            else
                cur = cur.left;
        }
        int i;
        for (i = tmp.size() - 1; i >= 0; --i) {
            res.add(tmp.get(i));
        }
    }

    static void addLeaves(TreeNode root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.val);
            return;
        }
        if (root.left != null)
            addLeaves(root.left, res);
        if (root.right != null)
            addLeaves(root.right, res);
    }

    static ArrayList<Integer> printBoundary(TreeNode node) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (isLeaf(node) == false) {
            ans.add(node.val);
        }
        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);
        return ans;
    }

    static boolean isLeaf(TreeNode root) {
        if (root.left == null && root.right == null)
            return true;
        return false;
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
        System.out.println(printBoundary(root));
    }
}
