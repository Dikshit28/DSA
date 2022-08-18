package ArshSheet.mathematics;

public class validSquare50 {
    static double line1 = 0;
    static double line2 = 0;

    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        return (decider(p1, p2) && decider(p1, p3) && decider(p1, p4) && decider(p2, p3) && decider(p2, p4)
                && decider(p3, p4));
    }

    public static boolean decider(int[] x1, int[] x2) {
        double dist = Math.sqrt(Math.pow((x2[0] - x1[0]), 2) + Math.pow((x2[1] - x1[1]), 2));
        if (dist == 0) {
            return false;
        } else if (line1 == 0) {
            line1 = dist;
        } else if (line2 == 0 && dist != line1) {
            line2 = dist;
        } else if (dist != line1 && dist != line2) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        int[] p1 = { 0, 0 }, p2 = { 1, 1 }, p3 = { 1, 0 }, p4 = { 0, 12 };
        System.out.println(validSquare(p1, p2, p3, p4));
    }
}
