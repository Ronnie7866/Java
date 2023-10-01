package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class twoSum {

    public static int[] TwoSum(int[] arr, int target){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] ans = {-1};
        for (int i = 0; i < arr.length; i++){
            int partner = target - arr[i];
            if (mp.containsKey(partner)){
                ans = new int[] {i,mp.get(partner)};
            }
            else{
                mp.put(arr[i], i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1};
        int [] ans  = TwoSum(arr,8);
        for (var i : ans){
            System.out.print(i + " ");
        }

    }
}
