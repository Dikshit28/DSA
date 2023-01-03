package PlacementQues;

public class myhashedin2 {
    public static int solution(int[] A) {
        // write your code in Java 8 (Java SE 8)
        int first = -1, second = -1, slice = 0, count = 0, repeat = 0;
        for (int curr : A) {
            if (curr == first || curr == second) {
                count++;
            } else {
                count = repeat + 1;
            }
            if (curr == first) {
                repeat++;
            } else {
                repeat = 1;
                second = first;
                first = curr;
            }
            slice = Math.max(count, slice);
        }
        return slice;
    }

    public static void main(String[] args) {
        int[] A = { 4, 4 };
        System.out.println(solution(A));
    }
}
