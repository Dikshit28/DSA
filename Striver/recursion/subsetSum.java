package Striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class subsetSum {
    public static void summer(int i, List<Integer> arr, int sum, List<Integer> sumset) {
        if (i == arr.size()) {
            sumset.add(sum);
            return;
        }
        summer(i + 1, arr, sum + arr.get(i), sumset);
        summer(i + 1, arr, sum, sumset);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> sumset = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        summer(0, arr, 0, sumset);
        System.out.println(sumset);
    }
}
