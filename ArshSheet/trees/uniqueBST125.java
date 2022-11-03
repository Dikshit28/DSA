package ArshSheet.trees;

import java.util.*;

public class uniqueBST125 {
    public static List<TreeNode> generateTrees(int n) {
        return generateSubtrees(1, n);
    }

    private static List<TreeNode> generateSubtrees(int s, int e) {
        List<TreeNode> res = new LinkedList<TreeNode>();
        if (s > e) {
            res.add(null); // empty tree
            return res;
        }

        for (int i = s; i <= e; ++i) {
            List<TreeNode> leftSubtrees = generateSubtrees(s, i - 1);
            List<TreeNode> rightSubtrees = generateSubtrees(i + 1, e);

            for (TreeNode left : leftSubtrees) {
                for (TreeNode right : rightSubtrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<TreeNode> res = generateTrees(3);
        for (TreeNode root : res) {
            System.out.println(TreeTraversals.levelOrder(root));
        }
    }
}
