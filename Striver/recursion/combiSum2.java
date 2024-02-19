package Striver.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combiSum2 {
    public static void summer(int ind, int[] arr, int target, List<Integer> temp, List<List<Integer>> tempset) {
        if (target == 0) {
            tempset.add(new ArrayList<>(temp));
            return;
        }
        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) // prevent repeat after first has been selected
                continue;
            if (arr[i] > target) // sorted array
                break;
            temp.add(arr[i]);
            summer(i + 1, arr, target - arr[i], temp, tempset);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1, 1, 2, 3, 4, 5 };
        int target = 14;
        Arrays.sort(arr);
        List<List<Integer>> tempset = new ArrayList<>();
        summer(0, arr, target, new ArrayList<>(), tempset);
        System.out.println(tempset.toString());
    }
}
