package PlacementQues;

import java.util.*;

public class hashedin4 {

    public static String[] table = { " ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static List<Integer> num_to_arr(int key) {
        List<Integer> res = new ArrayList<>();
        while (key > 0) {
            res.add(key % 10);
            key = (int) key / 10;
        }
        return res;
    }

    public static List<String> keypad(int key) {
        Queue<String> q = new LinkedList<>();
        List<String> list = new LinkedList<>();
        List<Integer> number = num_to_arr(key);
        int n = number.size();
        q.add("");
        while (!q.isEmpty()) {
            String s = q.remove();
            // If complete word is generated
            // push it in the list
            if (s.length() == n)
                list.add(s);
            else {
                String val = table[number.get(s.length())];
                for (int i = 0; i < val.length(); i++) {
                    q.add(s + val.charAt(i));
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums = 0;
        while (nums != -1) {
            System.out.print("Enter a number :");
            nums = sc.nextInt();
            List<String> res = keypad(nums);
            System.out.println(res);
        }
        sc.close();
    }
}
