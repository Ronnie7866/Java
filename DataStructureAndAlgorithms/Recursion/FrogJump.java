package DataStructureAndAlgorithms.Recursion;

public class FrogJump {

    private static int minCost(int[] arr, int idx) {
        if(idx == arr.length-1) return 0;
        int oneStep = Math.abs(arr[idx]-arr[idx+1]) + minCost(arr, idx + 1);
        if(idx == arr.length-2) return oneStep;
        int twoStep = Math.abs(arr[idx]-arr[idx+2]) + minCost(arr, idx + 2);
        return Math.min(oneStep, twoStep);
    }
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 20};
        int ans = minCost(arr, 0);
        System.out.println(ans);
    }
}
