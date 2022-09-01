package PlacementQues;

import java.util.*;

public class lexicgraphicallySort {
    public static void main(String[] args) {
        // lexicographically sort strings
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        };
        String[] strings = { "Harit", "Girish", "Gritav",
                "Lovenish", "Nikhil", "Harman" };
        Arrays.sort(strings, comparator);
        for (String string : strings) {
            System.out.print(string + " ");
        }
    }
}
