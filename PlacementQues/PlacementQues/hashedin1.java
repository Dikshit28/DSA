package PlacementQues;

import java.util.*;

/* Next greater element in the array using stack and map
 * if the curr element in array is greater than element currently at top of stack, then 
 * remove the element from stack and put it in map with key as the element and value as the curr element
 * if the curr element is less than the element at top of stack, then push the curr element in stack
 * Return original array with values from map if present else 0
*/
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