package ArshSheet.trees;

public class mimAbsolDiff119 {
    static int min = Integer.MAX_VALUE;
    static Integer prev = null;

    public static int getMinimumDifference(TreeNode root) {
        if (root == null)
            return min;

        getMinimumDifference(root.left);

        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;

        getMinimumDifference(root.right);

        return min;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(6);
        TreeNode l11 = new TreeNode(1);
        TreeNode r11 = new TreeNode(3);
        root.left = l1;
        root.right = r1;
        l1.left = l11;
        l1.right = r11;
        /*
         ******** 4
         ***** 2*****6
         **** 1*3
         */
        System.out.println(getMinimumDifference(root));
    }
}
