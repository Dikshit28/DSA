package PlacementQues;

import java.util.*;

public class myhashedin1 {
    public static int solution(int[] A) {
        int i, j, res = 1, n = A.length, count = 1;
        Arrays.sort(A);
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        mp.put(A[0], 1);
        for (i = 1; i < n; i++) {
            mp.put(A[i], mp.getOrDefault(A[i], 0) + 1);
            if (A[i] == A[i - 1]) {
                count++;
                res = Math.max(res, count);
            } else
                count = 1;
        }
        for (j = 1; j <= 100; j++) {
            for (i = 0; i < n; i++) {
                int k = A[i];
                count = 0;
                while (mp.getOrDefault(k, 0) != 0) {
                    k += j;
                    count++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int A[] = { 4, 7, 1, 5, 3 };
        System.out.println(solution(A));
    }
}
