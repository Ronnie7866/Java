package DataStructureAndAlgorithms.GeeksForGeeks;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {

    private static int[] stockSpan(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        ans[0] = 1;
        st.push(0);
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) { // jb tk stack me chota element h arr[i] se to pop kro
                st.pop();
            }
            if (st.isEmpty()) {// st empty ho to ans[i] me 1
                ans[i] = i + 1; // f the stack is empty, it means the current day has the highest stock price among the preceding days, and the span is set to the total number of days so far (from the beginning up to the current day).
            } else {
                ans[i] = i - st.peek();// current element ka index - last jo sbse bada ele tha i.e. st ka peek
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int [] ans = stockSpan(arr);
        System.out.println(Arrays.toString(ans));
    }
}
