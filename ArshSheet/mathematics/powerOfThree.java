package ArshSheet.mathematics;

public class powerOfThree {
    public static boolean isPowerOfThree(int n) {
        return n > 0 && Math.pow(3, 19) % n == 0;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(isPowerOfThree(n));
    }
}
