package ArshSheet.mathematics;

public class happyNumber44 {
    public static boolean isHappy(int n) {
        if (n <= 0)
            return false;
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            n = sum;
        }
        return n == 1 || n == 7;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(isHappy(n));
    }
}
