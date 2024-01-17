package DataStructureAndAlgorithms.Greedy;

import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        LinkedList<int[]> merged = new LinkedList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (var i : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < i[0]) {
                merged.add(i);
            }
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1],i[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] ans = merge(intervals);
        System.out.println(Arrays.toString(ans));
    }
}
