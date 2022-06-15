package ArshSheet.arrays;

import java.util.*;

public class threeSum13 {
    static List<List<Integer>> solver(int[] arr) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int l = i + 1;
            int r = arr.length - 1;
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            while (l < r) {
                int threeSum = arr[i] + arr[l] + arr[r];
                if (threeSum > 0) {
                    r--;
                } else if (threeSum < 0) {
                    l++;
                } else {
                    res.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    l++;
                    while (arr[l] == arr[l - 1] && l < r) {
                        l++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> output = solver(arr);
        System.out.println(output);
    }
}
