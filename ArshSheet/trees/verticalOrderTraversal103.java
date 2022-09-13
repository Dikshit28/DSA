package ArshSheet.trees;

import java.util.*;

public class verticalOrderTraversal103 {
    static int leastCol;
    static int mostCol;

    static List<List<Integer>> ans;
    static PriorityQueue<Pair> pq;

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        ans = new ArrayList<List<Integer>>();

        bfs(root);
        int sumCol = mostCol - leastCol + 1;

        for (int i = 0; i < sumCol; i++)
            ans.add(new ArrayList<Integer>());

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            ((ArrayList<Integer>) ans.get(-leastCol + curr.col)).add(curr.node.val);
        }

        return (List<List<Integer>>) ans;
    }

    public static void bfs(TreeNode root) {
        Queue<Pair> q = new LinkedList<Pair>();
        pq = new PriorityQueue<Pair>();
        int row = 0;
        int col = 0;
        q.add(new Pair(row, col, root));
        leastCol = 0;
        mostCol = 0;
        row = 1;

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            pq.add(curr);

            if (curr.node.left != null) {
                q.add(new Pair(curr.row + 1, curr.col - 1, curr.node.left));
                leastCol = Math.min(leastCol, curr.col - 1);
            }
            if (curr.node.right != null) {
                q.add(new Pair(curr.row + 1, curr.col + 1, curr.node.right));
                mostCol = Math.max(mostCol, curr.col + 1);

            }
        }
    }

    static class Pair implements Comparable<Pair> {
        int col;
        int row;
        TreeNode node;

        public Pair(int r, int c, TreeNode n) {
            row = r;
            col = c;
            node = n;
        }

        public int compareTo(Pair p) {
            if (col != p.col)
                return col - p.col;
            if (row != p.row)
                return row - p.row;
            return node.val - p.node.val;
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
        System.out.println(verticalTraversal(root));
    }
}
