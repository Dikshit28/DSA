package ArshSheet.trees;

public class childrenSum110 {
    public static void changeTree(TreeNode root) {
        if (root == null)
            return;
        int child = 0;
        if (root.left != null) {
            child = root.left.val;
        }
        if (root.right != null) {
            child = root.right.val;
        }
        if (child >= root.val)
            root.val = child;
        else {
            if (root.left != null)
                root.left.val = root.val;
            else if (root.right != null)
                root.right.val = root.val;
        }
        changeTree(root.left);
        changeTree(root.right);

        int tot = 0;
        if (root.left != null)
            tot += root.left.val;
        if (root.right != null)
            tot += root.right.val;
        if (root.left != null || root.right != null)
            root.val = tot;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(40);
        TreeNode l1 = new TreeNode(10);
        TreeNode r1 = new TreeNode(20);
        TreeNode l11 = new TreeNode(2);
        TreeNode r11 = new TreeNode(5);
        TreeNode l12 = new TreeNode(30);
        TreeNode r12 = new TreeNode(40);
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
         ******** 7
         ***** 5*****6
         **** 4*3***5*4
         */
        TreeTraversals.preorder(root);
        System.out.println();
        changeTree(root);
        TreeTraversals.preorder(root);
    }
}
