package DataStructureAndAlgorithms.Backtracking;

import java.util.ArrayList;

public class Combinations {

    public static void combination(int n, int k, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> arr, int idx) {
        if (arr.size() == k) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        for (int i = idx; i <= n; i++) {
            arr.add(i);
            combination(n,k,ans,arr,i+1);
            arr.remove(arr.size()-1);
        }
    }
    public static void main(String[] args) {
        int n = 105;
        int k = 2;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        combination(n, k, ans, new ArrayList<Integer>(), 1);
        System.out.println(ans);
    }
}
