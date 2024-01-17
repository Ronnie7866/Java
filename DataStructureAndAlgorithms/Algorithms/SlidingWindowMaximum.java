package DataStructureAndAlgorithms.Algorithms;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    private static int[] slidingWindowMax(int[] arr, int k) {
        int[] ans = new int[arr.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            // out of bound index to remove kro
            if (!dq.isEmpty() && i - k == dq.peek()) {
                dq.poll();
            }
            while (!dq.isEmpty() && arr[i] > arr[dq.peekLast()]) dq.pollLast();
            dq.add(i);
            if (i >= k - 1) {
                ans[idx++] = arr[dq.peek()];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ans = slidingWindowMax(arr, k);
        System.out.println(Arrays.toString(ans));
    }
}
