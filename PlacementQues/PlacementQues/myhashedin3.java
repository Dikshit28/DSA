package PlacementQues;

public class myhashedin3 {
    public static int solution(int A, int B) {
        // write your code in Java 8 (Java SE 8)
        A = A * B;
        B = 0;
        while (A > 0) {
            A &= (A - 1);
            B++;
        }
        return B;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 2));
    }
}
