package ArshSheet.arrays;

import java.util.*;

public class findingDups11 {
    static List<Integer> solver(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        if (nums.length == 0)
            return list;

        for (int i = 0; i < nums.length; i++) {

            if (hm.containsKey(nums[i])) {

                list.add(nums[i]);
                hm.put(nums[i], hm.get(nums[i]) + 1);

            } else
                hm.put(nums[i], 1);
        }
        return list;
    }

    static List<Integer> optimal(int[] nums) {
        final List<Integer> duplicates = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            final int n = Math.abs(nums[i]);
            if (nums[n - 1] < 0) {
                duplicates.add(n);
            } else {
                nums[n - 1] *= -1;
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        // The list of size n has integers from [1..n]
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> dups = solver(arr);
        System.out.println(dups);
        List<Integer> dupi = optimal(arr);
        System.out.println(dupi);
    }
}
