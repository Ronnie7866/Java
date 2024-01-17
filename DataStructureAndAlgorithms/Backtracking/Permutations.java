package DataStructureAndAlgorithms.Backtracking;

import java.util.ArrayList;

public class Permutations {
    public static void permutation(int[] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp) {
        if (temp.size() == arr.length){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int j : arr) {
            if(temp.contains(j)) continue;
            temp.add(j);
            permutation(arr, ans, temp);
            temp.remove(temp.size() - 1);

        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        permutation(arr,ans, new ArrayList<Integer>());
        System.out.println(ans);
    }
}
