package ArshSheet.mathematics;

public class reverseInteger47 {
    // wrong as of now
    public static int reverse(int x) {
        int rev = 0;
        int i = x < 0 ? -1 * x : x;
        for (; i >= 1; i = (int) i / 10) {
            rev = rev * 10 + i % 10;
        }
        return x < 0 ? -rev : rev;
    }

    public static void main(String[] args) {
        int x = -1234;
        System.out.println(reverse(x));
    }
}
