package DataStructureAndAlgorithms.LeetCode;
import java.util.*;

public class LeetCode_412 {
        public List<String> fizzBuzz(int n) {
            List<String> ans = new ArrayList<>();
            for(int i = 1; i <= n; i++) {
                String idx = String.valueOf(i);
                if (i % 3 == 0 && i % 5 == 0) {
                    ans.add("FizzBuzz");
                }
                else if (i % 3 == 0) {
                    ans.add("Fizz");
                } else if (i % 5 == 0) {
                    ans.add("Buzz");
                } else ans.add(idx);
            }
            return ans;
        }

    public static void main(String[] args) {
    }
}
