package Striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class combiSum {
    public static void summer(int i, int[] arr, int target, List<Integer> temp) {

        if (i == arr.length) {
            if (target == 0) {
                System.out.println(temp.toString());
            }
            return;
        }
        if (arr[i] <= target) {
            temp.add(arr[i]);
            summer(i, arr, target - arr[i], temp);
            temp.remove(temp.size() - 1);
        }
        summer(i + 1, arr, target, temp);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5 };
        int target = 2;
        summer(0, arr, target, new ArrayList<>());
    }
}
