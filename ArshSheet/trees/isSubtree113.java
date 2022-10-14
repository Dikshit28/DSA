package ArshSheet.trees;

public class isSubtree113 {
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (isEqualTree(root, subRoot))
            return true;
        if (root == null)
            return false;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private static boolean isEqualTree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null)
            return root2 == root1;
        return root1.val == root2.val && isEqualTree(root1.left, root2.left) && isEqualTree(root1.right, root2.right);
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
        TreeNode subRoot = new TreeNode(3);
        TreeNode subRootl1 = new TreeNode(6);
        TreeNode subRootr1 = new TreeNode(7);
        subRoot.left = subRootl1;
        subRoot.right = subRootr1;
        System.out.println(isSubtree(root, subRoot));
    }
}
