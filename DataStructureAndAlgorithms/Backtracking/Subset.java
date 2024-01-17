package DataStructureAndAlgorithms.Backtracking;

import java.util.*;
public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (var num : arr) {
            int k = outer.size();
            for (int i = 0; i < k; i++) {
                ArrayList<Integer> temp = new ArrayList<>(outer.get(i));
                temp.add(num);
                outer.add(temp);
            }
        }
        return outer;
    }
}
