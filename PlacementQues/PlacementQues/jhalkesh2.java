package PlacementQues;

import java.util.*;

public class jhalkesh2 {
    public static List<Integer> findDataLocations(List<Integer> locations, List<Integer> movedFrom,
            List<Integer> movedTo) {
        int i = 0;
        while (i < locations.size()) {
            if (movedFrom.contains(locations.get(i))) {
                locations.set(i, movedTo.get(movedFrom.indexOf(locations.get(i))));
            } else {
                i++;
            }
        }

        return locations;
    }

    public static void main(String[] args) {
        List<Integer> locations = Arrays.asList(1, 5, 2, 6);
        List<Integer> movedFrom = Arrays.asList(1, 4, 5, 7);
        List<Integer> movedTo = Arrays.asList(4, 7, 1, 3);
        List<Integer> ls = findDataLocations(locations, movedFrom, movedTo);
        System.out.println(ls);
    }
}
