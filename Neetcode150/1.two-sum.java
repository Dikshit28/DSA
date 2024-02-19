import java.lang.reflect.Array;
import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                return new int[] { hm.get(nums[i]), i };
            }
            hm.put(target - nums[i], i);
        }
        return nullvalo;
    }
}
// @lc code=end
