package LeetCodeContests;

import java.util.HashMap;

/**
 * biWeekly_86_1
 */
public class biWeekly_86_1 {
    public static boolean findSubarrays(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sums = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            sums = nums[i] + nums[i + 1];
            if (hm.containsKey(sums)) {
                return true;
            }
            hm.put(sums, 0);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(findSubarrays(arr));
    }
}