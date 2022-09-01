package PlacementQues;

import java.util.*;

public class coordinatesSort {

    public static void main(String[] args) {
        // sort coordinates by X then Y in (X,Y)
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return a[0] - b[0];
            }
        };
        int[][] coordinates = { { 1, 2 }, { 3, 4 }, { 1, 3 }, { 2, 4 }, { 1, 2 }, { 3, 4 }, { 2, 1 } };
        Arrays.sort(coordinates, comparator);
        for (int[] coordinate : coordinates) {
            System.out.println(Arrays.toString(coordinate));
        }
    }
}
