package DataStructureAndAlgorithms.GeeksForGeeks;

import DataStructureAndAlgorithms.Arrays.Array;

import java.util.ArrayList;

public class SumOfSubset {

    private static void subsetSum(ArrayList<Integer> arr, ArrayList<Integer> ans, int idx, int sum) {
        if (idx == arr.size()) {
            ans.add(sum);
            return;
        }
        subsetSum(arr,ans,idx+1,sum+arr.get(idx));
        subsetSum(arr,ans,idx+1,sum);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        int sum = 0;
        subsetSum(arr,ans,0,sum);
        System.out.println(ans);

    }
}
