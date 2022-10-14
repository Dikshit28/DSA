package ArshSheet.trees;

public class mergeTrees116 {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return null;
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;

        TreeNode new_node = new TreeNode(t1.val + t2.val);

        new_node.left = mergeTrees(t1.left, t2.left);
        new_node.right = mergeTrees(t1.right, t2.right);

        return new_node;
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
        TreeNode subRoot = new TreeNode(9);
        TreeNode subRootl1 = new TreeNode(8);
        TreeNode subRootr1 = new TreeNode(7);
        TreeNode subRootr11 = new TreeNode(4);
        TreeNode subRootr12 = new TreeNode(3);
        subRoot.left = subRootl1;
        subRoot.right = subRootr1;
        subRootr1.left = subRootr11;
        subRootr1.right = subRootr12;
        TreeNode newnode = mergeTrees(root, subRoot);
        System.out.println(TreeTraversals.levelOrder(newnode));
    }
}
