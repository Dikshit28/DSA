package ArshSheet.searching_sorting;

import java.util.HashMap;

public class pairSum53 {
    public static int findPair(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int result = 0;
        for (int i : map.keySet())
            if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1)
                result++;
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 1, 5 };
        int n = 2;
        System.out.println(findPair(arr, n));
    }
}
