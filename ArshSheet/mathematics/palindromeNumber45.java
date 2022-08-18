package ArshSheet.mathematics;

public class palindromeNumber45 {
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int rev = 0;
        for (int i = x; i >= 1; i = (int) (i / 10))
            rev = rev * 10 + i % 10;
        return rev == x;
    }

    public static void main(String[] args) {
        int x = 123456;
        System.out.println(isPalindrome(x));
    }
}
