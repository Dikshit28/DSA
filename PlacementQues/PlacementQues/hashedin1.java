package PlacementQues;

import java.util.*;

class hashedin1 {
    public static int[] nextGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && st.peek() < arr[i]) {
                mp.put(st.pop(), arr[i]);
            }
            st.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = mp.getOrDefault(arr[i], 0);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 7, 2, 11 };
        int[] res = nextGreater(arr);
        for (int i : res) {
            System.out.print(i + ",");
        }
    }
}