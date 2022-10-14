package ArshSheet.trees;

import java.util.*;

public class allPaths117 {
    static List<String> paths = new ArrayList<>();

    public static List<String> binaryTreePaths(TreeNode root) {
        if (root != null)
            next(root, "");
        return paths;
    }

    private static void next(TreeNode root, String path) {
        if (root.left == null && root.right == null)
            paths.add(path + root.val);
        if (root.left != null)
            next(root.left, path + root.val + "->");
        if (root.right != null)
            next(root.right, path + root.val + "->");
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
        System.out.println(binaryTreePaths(root));
    }
}
