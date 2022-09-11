package PlacementQues;

public class stringCreation {
    public static String solution(int input1, String[] input2) {
        StringBuilder s = new StringBuilder();
        if (input1 == 1) {
            return input2[0];
        }
        int i = 0, j = 0, k = 0;
        for (i = 0; i < input2.length - 1; i++) {
            j = k = 0;
            while (input2[i].charAt(j) != input2[i + 1].charAt(k)) {
                s.append(input2[i].charAt(j));
                j++;
            }
        }
        while (k < input2[i].length()) {
            s.append(input2[i].charAt(k));
            k++;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String[] input2 = { "42y", "2ya", "ya6" };
        int input1 = input2.length;
        System.out.println(solution(input1, input2));
    }
}
