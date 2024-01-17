package DataStructureAndAlgorithms.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubsets {
    private static void subset(int[] arr, List<List<Integer>> ans, List<Integer> list, int idx) {

            ans.add(new ArrayList<>(list));


        for (int i = idx; i < arr.length; i++) {
            list.add(arr[i]);
            subset(arr, ans, list, i+1);
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        List<List<Integer>> ans = new ArrayList<>();
        subset(arr, ans, new ArrayList<>(), 0);
        System.out.println(ans);
    }
}
