package DataStructureAndAlgorithms.Backtracking;

import java.util.Arrays;

class Solution {
    private static boolean find(int[] arr, int halfSum, int currSum, int idx, boolean[][] memo) {
        if(currSum == halfSum) return true;
        if(currSum < halfSum || idx == arr.length) return false;

        if (memo[idx][currSum]) {
            return memo[idx][currSum];
        }


        int include = currSum = arr[idx];
        boolean first = find(arr, halfSum, include, idx + 1, memo);
        boolean second = find(arr, halfSum, currSum, idx + 1, memo);
        boolean result = first || second;
        memo[idx][currSum] = result;
        return result;
    }
    public boolean canPartition(int[] nums) {
        if(nums.length == 1) return false;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        // agr sum odd aaya to to 2 equal parts me devide ni kr skte
        if(sum % 2 != 0) return false;



        int halfSum = sum / 2;
        boolean[][] memo = new boolean[nums.length][halfSum + 1];

        if(find(nums, halfSum, 0, 0, memo)) return true;
        return false;
    }
}