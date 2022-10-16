package ArshSheet.trees;

public class presucKey121 {
    public static TreeNode suc = null, pre = null;

    public static void findPreSuc(TreeNode root, int val) {

        // Base case
        if (root == null)
            return;

        // If val is present at root
        if (root.val == val) {

            // The maximum value in left
            // subtree is predecessor
            if (root.left != null) {
                TreeNode tmp = root.left;
                while (tmp.right != null)
                    tmp = tmp.right;

                pre = tmp;
            }

            // The minimum value in
            // right subtree is successor
            if (root.right != null) {
                TreeNode tmp = root.right;

                while (tmp.left != null)
                    tmp = tmp.left;

                suc = tmp;
            }
            return;
        }

        // If val is smaller than
        // root's val, go to left subtree
        if (root.val > val) {
            suc = root;
            findPreSuc(root.left, val);
        }

        // Go to right subtree
        else {
            pre = root;
            findPreSuc(root.right, val);
        }
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
        int val = 4;
        findPreSuc(root, val);
        System.out.print("Inorder ");
        TreeTraversals.inorder(root);
        System.out.println(" val =" + val);
        System.out.println("Pre " + pre.val + " Suc " + suc.val);
    }
}
