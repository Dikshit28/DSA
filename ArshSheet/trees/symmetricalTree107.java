package ArshSheet.trees;

/**
 * symmetricalTree107
 */
public class symmetricalTree107 {
    public static boolean checkSymmetry(TreeNode root) {
        return root == null || isSymmetrical(root.left, root.right);
    }

    private static boolean isSymmetrical(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        if (left.val != right.val)
            return false;
        return isSymmetrical(left.left, right.right) && isSymmetrical(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(2);
        TreeNode l11 = new TreeNode(4);
        TreeNode r11 = new TreeNode(5);
        TreeNode l12 = new TreeNode(5);
        TreeNode r12 = new TreeNode(4);
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
        /*
         ******** 1
         ***** 2*****3
         **** 4*5***5*4
         */
        System.out.println(checkSymmetry(root));
    }
}