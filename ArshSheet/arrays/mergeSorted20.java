package ArshSheet.arrays;

public class mergeSorted20 {
    public static void merge(int[] A, int m, int[] B, int n) {
        for (int i = m + n - 1, a = m - 1, b = n - 1; b >= 0; i--) {
            if (a >= 0 && A[a] > B[b])
                A[i] = A[a--];
            else
                A[i] = B[b--];
        }
    }
    /*
     * public void merge(int[] nums1, int m, int[] nums2, int n) {
     * int a=m-1,b=m+n-1,c=n-1;
     * while(c>=0){
     * if(a>=0 && nums1[a]>nums2[c]){
     * nums1[b]=nums1[a];
     * a--;
     * }
     * else{
     * nums1[b]=nums2[c];
     * c--;
     * }
     * b--;
     * }
     * }
     */

    public static void main(String[] args) {
        int[] nums1 = { 4, 0, 0, 0, 0, 0 };
        int m = 1;
        int[] nums2 = { 1, 2, 3, 5, 6 };
        int n = 5;
        merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.print(i);
        }
    }
}
