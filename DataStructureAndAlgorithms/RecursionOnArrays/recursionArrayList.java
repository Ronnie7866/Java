package DataStructureAndAlgorithms.RecursionOnArrays;

import java.util.ArrayList;

public class recursionArrayList {

    static ArrayList<Integer> indexArrayList(int[] arr, int idx, int target){
        // base case
        if (arr.length == idx) return new ArrayList<Integer>();
        // self work
        ArrayList<Integer> ans = new ArrayList<>();
        if (target == arr[idx]){
            ans.add(idx);
        }
        // recursive work
        ArrayList<Integer> smallAns = indexArrayList(arr,idx+1,target);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,4,2,6,4,4,8,4};
        System.out.println(indexArrayList(arr,0,4));
    }
}
