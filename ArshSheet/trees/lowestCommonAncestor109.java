package ArshSheet.trees;

import java.util.*;

public class lowestCommonAncestor109 {
    private static boolean getPath(TreeNode root, ArrayList<Integer> arr, int x) {
        if (root == null) {
            return false;
        }
        arr.add(root.val);
        if (root.val == x) {
            return true;
        }
        if (getPath(root.left, arr, x) || getPath(root.right, arr, x)) {
            return true;
        }
        arr.remove(arr.size() - 1);
        return false;
    }

    public static Integer solve(TreeNode A, int B, int C) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        if (A == null)
            return -1;
        getPath(A, arr, B);
        getPath(A, arr2, C);
        int i;
        for (i = 0; i < Math.min(arr.size(), arr2.size()); i++) {
            if (arr.get(i) != arr2.get(i)) {
                break;
            }
        }
        return arr.get(i - 1);
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
        System.out.println(solve(root, 9, 8));
    }
}
