package ArshSheet.stack_queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class removeAdjacentDups95 {
    public static String removeDuplicates(String s, int k) {
        Deque<Character> charSt = new ArrayDeque<>();
        Deque<Integer> countSt = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (charSt.size() > 0 && charSt.peek() == ch)
                countSt.push(countSt.peek() + 1);
            else
                countSt.push(1);

            charSt.push(ch);
            if (countSt.peek() == k) {
                for (int i = 0; i < k; i++) {
                    charSt.pop();
                    countSt.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (charSt.size() > 0)
            sb.append(charSt.pop());
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        int k = 3;
        System.out.println(removeDuplicates(s, k));
    }

}
