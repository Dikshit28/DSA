package Striver.hashing;

import java.util.*;
import java.util.Map.Entry;

public class frequency {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3, 4 };
        int[] res = getFrequencies(arr);
        System.out.println("max: " + res[0] + " min: " + res[1]);
    }

    public static int[] getFrequencies(int[] v) {
        Map<Integer, Integer> mp = new HashMap<>();
        int[] res = new int[2];
        res[0] = res[1] = Integer.MAX_VALUE;
        for (int i : v) {
            System.out.println("i: " + i);
            mp.put(i, mp.getOrDefault(i, 0) + 1);
            System.out.println("updated freq of " + i + " is " + mp.get(i));
        }
        int mx = 0, lw = v.length;
        for (Entry<Integer, Integer> i : mp.entrySet()) {
            if (i.getValue() > mx || (i.getValue() == mx && i.getKey() < res[0])) {
                mx = i.getValue();
                res[0] = i.getKey();
            }
            if (i.getValue() < lw || (i.getValue() == lw && i.getKey() < res[1])) {
                lw = i.getValue();
                res[1] = i.getKey();
            }
        }
        return res;
    }
}
