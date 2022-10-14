package ArshSheet.trees;

public class lowestCommonAncestor118 {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(8);
        TreeNode l11 = new TreeNode(0);
        TreeNode r11 = new TreeNode(4);
        TreeNode l12 = new TreeNode(7);
        TreeNode r12 = new TreeNode(9);
        TreeNode l21 = new TreeNode(3);
        TreeNode r21 = new TreeNode(4);
        root.left = l1;
        root.right = r1;
        l1.left = l11;
        l1.right = r11;
        r1.left = l12;
        r1.right = r12;
        r11.left = l21;
        l21.left = r21;
        /*
         ******** 6
         ***** 2*****8
         **** 0*4***7*9
         ***** 3*5
         */
        TreeNode p = l1;
        TreeNode q = l12;
        System.out.println(lowestCommonAncestor(root, p, q).val);
    }
}
