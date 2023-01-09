package LeetCodeContests.January;

import java.util.*;

public class minimum_rounds_to_complete_all_tasks_4 {
    public static int minimumRounds(int[] A) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int a : A)
            count.put(a, count.getOrDefault(a, 0) + 1);
        int res = 0;
        for (int freq : count.values()) {
            if (freq == 1)
                return -1;
            res += (freq + 2) / 3;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] tasks = { 2, 2, 3, 3, 2, 4, 4, 4, 4, 4 };
        System.out.println(minimumRounds(tasks));
    }
}
