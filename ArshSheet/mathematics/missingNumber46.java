package ArshSheet.mathematics;

public class missingNumber46 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber(nums));
    }
}
