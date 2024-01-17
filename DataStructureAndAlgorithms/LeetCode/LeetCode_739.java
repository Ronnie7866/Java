package DataStructureAndAlgorithms.LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode_739 {
    public static int[] dailyTemperatures(int[] temperatures) {
            Stack<Integer> stack = new Stack<>();
            int[] ans = new int[temperatures.length];
            ans[temperatures.length - 1] = 0;
            stack.push(temperatures.length - 1);

            for (int i = temperatures.length - 2; i >= 0; i--) {
                while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    ans[i] = 0;
                } else {
                    ans[i] = stack.peek() - i;
                }
                stack.push(i);
            }

            return ans;
        }

    public static void main(String[] args) {
        int[] arr = {89, 62, 70, 58, 47, 47, 46, 76, 100, 70};
        int[] ans = dailyTemperatures(arr); // 8,1,5,4,3,2,1,1,0,0
        System.out.println(Arrays.toString(ans));

    }
}
