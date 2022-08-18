package ArshSheet.searching_sorting;

import java.util.*;;

public class pairSum51 {
    static boolean isPossible(Integer a[], int b[], int n, int k) {
        int mins = Integer.MAX_VALUE, maxs = Integer.MIN_VALUE, suma = 0, sumb = 0;
        for (int i = 0; i < n; i++) {
            mins = Math.min(mins, a[i]);
            maxs = Math.max(maxs, b[i]);
            suma += a[i];
            sumb += b[i];
        }
        return (mins + maxs >= k && suma + sumb >= k * n) ? true : false;
    }

    static boolean isPossible2(Integer a[], int b[],
            int n, int k) {
        // Sort the array a[] in decreasing order.
        Arrays.sort(a, Collections.reverseOrder());

        // Sort the array b[] in increasing order.
        Arrays.sort(b);

        // Checking condition on each index.
        for (int i = 0; i < n; i++)
            if (a[i] + b[i] < k)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Integer a[] = { 2, 1, 3 };
        int b[] = { 7, 8, 9 };
        int k = 10;
        int n = a.length;

        if (isPossible(a, b, n, k))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (isPossible2(a, b, n, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
