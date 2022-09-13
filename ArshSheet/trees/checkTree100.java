package ArshSheet.trees;

public class checkTree100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null)
            return p == q;
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        TreeNode l11 = new TreeNode(4);
        TreeNode r11 = new TreeNode(5);
        TreeNode l12 = new TreeNode(6);
        TreeNode r12 = new TreeNode(7);
        // TreeNode l21 = new TreeNode(8);
        // TreeNode l31 = new TreeNode(9);
        root.left = l1;
        root.right = r1;
        l1.left = l11;
        l1.right = r11;
        r1.left = l12;
        r1.right = r12;
        TreeNode root0 = new TreeNode(1);
        TreeNode l01 = new TreeNode(2);
        TreeNode r01 = new TreeNode(3);
        TreeNode l011 = new TreeNode(4);
        TreeNode r011 = new TreeNode(5);
        TreeNode l012 = new TreeNode(6);
        TreeNode r012 = new TreeNode(7);
        TreeNode l021 = new TreeNode(8);
        // TreeNode l31 = new TreeNode(9);
        root0.left = l01;
        root0.right = r01;
        l01.left = l011;
        l01.right = r011;
        r01.left = l012;
        r01.right = r012;
        l011.left = l021;
        System.out.println(isSameTree(root, root0));

    }
}
