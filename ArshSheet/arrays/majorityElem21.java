package ArshSheet.arrays;

public class majorityElem21 {
    // 1. sort then retun nums[nums.length/2]
    // 2. create hashmap
    // 3. moore voting
    // 4. bit manipulation
    // Moore voting algorithm
    public static int majorityElement3(int[] nums) {
        int count = 0, ret = 0;
        for (int num : nums) {
            if (count == 0)
                ret = num;
            if (num != ret)
                count--;
            else
                count++;
        }
        return ret;
    }

    // Bit manipulation
    public static int majorityElement(int[] nums) {
        int[] bit = new int[32];
        for (int num : nums)
            for (int i = 0; i < 32; i++)
                if ((num >> (31 - i) & 1) == 1)
                    bit[i]++;
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            bit[i] = bit[i] > nums.length / 2 ? 1 : 0;
            ret += bit[i] * (1 << (31 - i));
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println(majorityElement3(nums));
        System.out.println(majorityElement(nums));
    }
}
