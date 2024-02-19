package Striver.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset2 {
    public static void subsetter(int i, int[] arr, List<Integer> set, List<List<Integer>> powerset) {
        powerset.add(new ArrayList<>(set));
        for (int ind = i; ind < arr.length; ind++) {
            if (ind != i && arr[ind] == arr[ind - 1])
                continue;
            set.add(arr[ind]);
            subsetter(ind + 1, arr, set, powerset);
            set.remove(set.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5 };
        List<List<Integer>> powerset = new ArrayList<>();
        Arrays.sort(arr);
        subsetter(0, arr, new ArrayList<>(), powerset);
        System.out.println(powerset);
    }
}
