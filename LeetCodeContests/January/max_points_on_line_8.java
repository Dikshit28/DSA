package LeetCodeContests.January;

import java.util.HashMap;

public class max_points_on_line_8 {
    public static int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2)
            return n;
        int ans = 2;
        for (int[] a : points) {
            HashMap<Double, Integer> map = new HashMap<>();
            for (int[] b : points) {
                if (a == b)
                    continue;
                double slope = 0;
                if (b[0] - a[0] == 0)
                    slope = Double.POSITIVE_INFINITY;
                else
                    slope = (b[1] - a[1]) / (double) (b[0] - a[0]);
                map.put(slope, map.getOrDefault(slope, 1) + 1);
                ans = Math.max(ans, map.get(slope));
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
