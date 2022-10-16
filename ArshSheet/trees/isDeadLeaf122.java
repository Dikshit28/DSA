package ArshSheet.trees;

public class isDeadLeaf122 {
    public static boolean isDeadEnd(TreeNode root) {
        return deadEnd(root, 0, Integer.MAX_VALUE);
    }

    static public boolean deadEnd(TreeNode root, Integer min, Integer max) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null) {
            if (root.val == min + 1 && root.val == max - 1)
                return true;
            else
                return false;
        }
        return deadEnd(root.left, min, root.val) || deadEnd(root.right, root.val, max);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode l1 = new TreeNode(5);
        TreeNode r1 = new TreeNode(10);
        TreeNode l11 = new TreeNode(2);
        TreeNode r11 = new TreeNode(7);
        TreeNode r21 = new TreeNode(9);
        root.left = l1;
        root.right = r1;
        l1.left = l11;
        l1.right = r11;
        r1.left = r21;
        /*
         ******** 8
         ***** 5*****10
         **** 2*7***9
         */
        System.out.println(isDeadEnd(root));
    }
}
