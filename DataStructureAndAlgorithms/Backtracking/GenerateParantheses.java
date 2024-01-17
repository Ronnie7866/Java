package DataStructureAndAlgorithms.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {
    private static void generate(List<String> list, String curr, int open, int close, int n) {
        if (curr.length() == 2 * n) {
            list.add(curr);
            return;
        }
        if (open < n) {
            generate(list, curr + '(', open + 1, close, n);
        }
        if (close < open) {
            generate(list, curr + ')', open, close + 1, n);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        List<String> ans = new ArrayList<>();
        generate(ans, "(", 1, 0, n);
        System.out.println(ans);
    }
}
