package ArshSheet.arrays;

import java.util.HashMap;

public class subarraySumDivide10 {
    static int sovler(int[] arr, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            int key = sum % k;
            if (key < 0) {
                key = key + k;
            }
            if (map.containsKey(key)) {
                count = map.get(key) + count;
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 0, -2, -3, 1 };
        int k = 5;
        int count = sovler(arr, k);
        System.out.println(count);
    }
}
