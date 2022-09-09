package ArshSheet.stack_queues;

import java.util.*;

public class dailyTemp91 {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ret[idx] = i - idx;
            }
            stack.push(i);
        }
        return ret;
    }

    public static int[] dailyTemperaturesArrays(int[] temperatures) {
        int[] stack = new int[temperatures.length];
        int top = -1;
        int[] ret = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (top > -1 && temperatures[i] > temperatures[stack[top]]) {
                int idx = stack[top--];
                ret[idx] = i - idx;
            }
            stack[++top] = i;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = { 34, 80, 80, 34, 34, 80, 80, 80, 80, 34 };
        int[] res = dailyTemperatures(arr);
        for (int i : res) {
            System.out.print(i + ",");
        }
        int[] res1 = dailyTemperaturesArrays(arr);
        for (int i : res1) {
            System.out.print(i + ",");
        }
    }
}
