package RecursionOnStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class subSetsubSequence {

    static void sumSubSet(int arr[], int idx, int currSum){
        if (idx >= arr.length) {
            System.out.print(currSum + " ");
            return;
        }
            // currSum choses to append
            sumSubSet(arr,idx+1,currSum + arr[idx]);
            // currSum not choses to append
            sumSubSet(arr,idx+1,currSum);
    }

    static void SSQ2(String str, String currAns){
        if (str.isEmpty()){
            System.out.println(currAns);
            return;
        }
        char curr = str.charAt(0);
        String remString = str.substring(1);
        SSQ2(remString,currAns + curr);
        SSQ2(remString , currAns);
        return;
    }

    static ArrayList<String> SSQ(String str){
        ArrayList<String> ans = new ArrayList<>();
        // base case
        if (str.length() == 0){
            ans.add("");
            return ans;
        }
        // recursive work
        char curr = str.charAt(0);
        ArrayList<String> smallAns = SSQ(str.substring(1));
        // base case
        for(String ss : smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,5};
        sumSubSet(arr,0,0);
    }
}
