package LeetCodeContests.January;

import java.util.*;

public class preorder_9 {

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<Integer>();
        if (root == null) {
            return ls;
        }
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while (!st.isEmpty()) {
            root= st.pop();
            ls.add(root.val);
            if (root.right != null) {
                st.push(root.right);
            }
            if (root.left != null) {
                st.push(root.left);
            }
        }
        return ls;
    }

    public static void main(String[] args) {

    }

}
