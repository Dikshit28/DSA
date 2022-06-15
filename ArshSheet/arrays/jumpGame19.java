package ArshSheet.arrays;

public class jumpGame19 {
    public static boolean canJump(int[] nums) {
        int pos = 0;
        return canJump(nums, pos);
    }

    private static boolean canJump(int[] nums, int pos) {
        boolean check = false;
        if (pos >= nums.length - 1) {
            return true;
        }
        int val = nums[pos];
        while (val > 0) {
            check = canJump(nums, pos + val);
            if (check) {
                return check;
            }
            val--;
        }
        return check;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 0 };
        System.out.println(canJump(nums));
    }
}
