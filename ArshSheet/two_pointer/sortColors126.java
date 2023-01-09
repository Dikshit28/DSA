package ArshSheet.two_pointer;

public class sortColors126 {
    public static void sortColors(int[] arr) {
        int n = arr.length, left = 0, right = n - 1, pointer = 0;
        while (pointer <= right) {
            if (arr[pointer] == 0) {
                int temp = arr[left];
                arr[left] = arr[pointer];
                arr[pointer] = temp;
                left++;
                pointer++;
            } else if (arr[pointer] == 2) {
                int temp = arr[right];
                arr[right] = arr[pointer];
                arr[pointer] = temp;
                right--;
            } else {
                pointer++;
            }
        }
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 2, 0, 2, 1, 0 };
        sortColors(arr);
    }
}
