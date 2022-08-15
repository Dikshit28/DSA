package ArshSheet.mathematics;

public class minMoves40 {
    public static int moves(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int minnum = Integer.MAX_VALUE;
        for (int i : arr) {
            sum += i;
            minnum = Math.min(minnum, i);
        }
        return (sum - (minnum * n));
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(moves(arr));
    }
}
