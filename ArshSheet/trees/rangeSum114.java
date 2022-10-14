package ArshSheet.trees;

public class rangeSum114 {
    static int sum = 0;

    public static int rangeSum(TreeNode root, int low, int high) {
        if (root == null)
            return 0; // base case.
        return (low <= root.val && root.val <= high ? root.val : 0) +
                rangeSum(root.right, low, high) + rangeSum(root.left, low, high);
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
        System.out.println(rangeSum(root, 7, 15));
    }
}
