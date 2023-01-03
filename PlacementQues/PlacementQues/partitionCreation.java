package PlacementQues;

import java.util.*;

public class partitionCreation {
    public static void part(String arithOperation, double arithResult, List<Integer> arrayOfIntegers) {
        List<List<Integer>> lst = new LinkedList<>();
        int k = 0;
        if (arrayOfIntegers.size() % 2 != 0) {
            System.out.println("Invalid Input");
            return;
        }
        switch (arithOperation) {
            case "+":
                for (Integer i : arrayOfIntegers) {
                    if (arrayOfIntegers.contains(Math.abs((int) arithResult - i))) {
                        Integer[] arr = { i, Math.abs((int) arithResult - i) };
                        Arrays.sort(arr);
                        if (!lst.contains(Arrays.asList(arr))) {
                            lst.add(Arrays.asList(arr));
                        }
                        k += 2;
                    }
                }
                if (k != arrayOfIntegers.size()) {
                    System.out.println("Invalid Input");
                }
                break;
            case "-":
                for (Integer i : arrayOfIntegers) {
                    if (arrayOfIntegers.contains(Math.abs((int) arithResult + i))) {
                        Integer[] arr = { i, Math.abs((int) arithResult + i) };
                        Arrays.sort(arr);
                        if (!lst.contains(Arrays.asList(arr))) {
                            lst.add(Arrays.asList(arr));
                        }
                        k += 2;
                    }
                }
                if (k != arrayOfIntegers.size()) {
                    System.out.println("Invalid Input");
                }
                break;
            case "*":
                for (Integer i : arrayOfIntegers) {
                    if (arrayOfIntegers.contains((int) arithResult * i)) {
                        Integer[] arr = { i, (int) arithResult * i };
                        Arrays.sort(arr);
                        if (!lst.contains(Arrays.asList(arr))) {
                            lst.add(Arrays.asList(arr));
                        }
                        k += 2;
                    }
                }
                if (k != arrayOfIntegers.size()) {
                    System.out.println("Invalid Input");
                }
                break;
            case "/":
                for (Integer i : arrayOfIntegers) {
                    if (i != 0 && arrayOfIntegers.contains((int) arithResult / i)) {
                        Integer[] arr = { i, (int) arithResult / i };
                        Arrays.sort(arr);
                        if (!lst.contains(Arrays.asList(arr))) {
                            lst.add(Arrays.asList(arr));
                        }
                        k += 2;
                    }
                }
                if (k != arrayOfIntegers.size()) {
                    System.out.println("Invalid Input");
                }
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println(lst);
    }

    public static void main(String[] args) {
        List<Integer> ls = new LinkedList<>();
        ls.add(2);
        ls.add(3);
        ls.add(5);
        ls.add(8);
        ls.add(0);
        ls.add(6);
        part("+", 8, ls);
    }
}
