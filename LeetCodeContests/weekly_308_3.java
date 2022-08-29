package LeetCodeContests;

/*
2391. Minimum Amount of Time to Collect Garbage

You are given a 0-indexed array of strings garbage where garbage[i] represents the assortment of garbage at the ith house. garbage[i] consists only of the characters 'M', 'P' and 'G' representing one unit of metal, paper and glass garbage respectively. Picking up one unit of any type of garbage takes 1 minute.

You are also given a 0-indexed integer array travel where travel[i] is the number of minutes needed to go from house i to house i + 1.

There are three garbage trucks in the city, each responsible for picking up one type of garbage. Each garbage truck starts at house 0 and must visit each house in order; however, they do not need to visit every house.

Only one garbage truck may be used at any given moment. While one truck is driving or picking up garbage, the other two trucks cannot do anything.

Return the minimum number of minutes needed to pick up all the garbage.
*/
public class weekly_308_3 {
    public static int garbageCollection(String[] garbage, int[] travel) {
        int tot = 0, G = 0, M = 0, P = 0, tg = 0, tm = 0, tp = 0;

        for (int i = 0; i != garbage[0].length(); i++)
            switch (garbage[0].charAt(i)) {
                case 'G':
                    G++;
                    break;
                case 'M':
                    M++;
                    break;
                case 'P':
                    P++;
                    break;
            }

        for (int i = 1; i != garbage.length; i++) {
            int g = 0, m = 0, p = 0;
            tot += travel[i - 1];

            for (int j = 0; j != garbage[i].length(); j++)
                switch (garbage[i].charAt(j)) {
                    case 'G':
                        g++;
                        break;
                    case 'M':
                        m++;
                        break;
                    case 'P':
                        p++;
                        break;
                }

            if (g != 0) {
                G += g;
                tg = tot;
            }
            if (m != 0) {
                M += m;
                tm = tot;
            }
            if (p != 0) {
                P += p;
                tp = tot;
            }
        }

        return G + M + P + tg + tm + tp;
    }

    public static void main(String[] args) {
        String[] garbage = { "G", "P", "GP", "GG" };
        int[] travel = { 2, 4, 3 };
        System.out.println(garbageCollection(garbage, travel));
    }
}
