package ArshSheet.trees;

import java.util.*;

public class nearestKNodes111 {
    static List<Integer> res;

    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<TreeNode> path = ntr(root, target.val);
        res = new ArrayList<>();
        for (int i = 0; i < path.size(); i++) {
            getKDown(path.get(i), k - i, i == 0 ? null : path.get(i - 1));
        }
        return res;
    }

    private static void getKDown(TreeNode node, int k, TreeNode blocker) {
        if (node == null || k < 0 || node == blocker)
            return;
        if (k == 0)
            res.add(node.val);
        getKDown(node.left, k - 1, blocker);
        getKDown(node.right, k - 1, blocker);
    }

    private static List<TreeNode> ntr(TreeNode root, int data) {
        if (root == null)
            return new ArrayList<>();
        if (root.val == data)
            return new ArrayList<TreeNode>(Arrays.asList(root));
        List<TreeNode> res = ntr(root.left, data);
        if (res.size() == 0)
            res = ntr(root.right, data);
        if (res.size() != 0)
            res.add(root);
        return res;
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
        System.out.println(distanceK(root, l11, 2));
    }
}
