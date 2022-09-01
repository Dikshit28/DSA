package PlacementQues;

public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
