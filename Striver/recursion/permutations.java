package Striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static void permuter(boolean[] freq, int[] arr, List<Integer> temp, List<List<Integer>> tempset) {
        if (temp.size() == arr.length) {
            tempset.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]) {
                temp.add(arr[i]);
                freq[i] = true;
                permuter(freq, arr, temp, tempset);
                temp.remove(temp.size() - 1);
                freq[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> tempset = new ArrayList<>();
        permuter(new boolean[arr.length], arr, new ArrayList<>(), tempset);
        System.out.println(tempset);
    }
}
