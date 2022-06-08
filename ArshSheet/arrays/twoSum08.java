package ArshSheet.arrays;

import java.util.HashMap;

public class twoSum08 {
    static int[] solver(int[] arr, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(target - arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) && i != map.get(arr[i])) {
                output[0] = i;
                output[1] = map.get(arr[i]);
                break;
            }
        }
        return output;
    }

    static int[] optimal(int[] numbers, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            Integer requiredNum = (Integer) (target - numbers[i]);
            if (indexMap.containsKey(requiredNum)) {
                int toReturn[] = { indexMap.get(requiredNum), i };
                return toReturn;
            }

            indexMap.put(numbers[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = { -1, -2, -3, -4, -5 };
        int target = -8;
        int[] out = solver(arr, target);
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i]);
        }
        System.out.println();
        int[] out1 = optimal(arr, target);
        for (int i = 0; i < out1.length; i++) {
            System.out.print(out1[i]);
        }
    }
}
