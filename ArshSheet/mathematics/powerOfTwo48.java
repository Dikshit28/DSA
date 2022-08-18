package ArshSheet.mathematics;

public class powerOfTwo48 {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }

    public static boolean isPowerOfTwo2(int n) {
        return ((n & (n - 1)) == 0 && n > 0);
    }

    public static void main(String[] args) {
        int n = 1024;
        System.out.println(isPowerOfTwo(n));
        System.out.println(isPowerOfTwo2(n));
    }
}
