package DataStructureAndAlgorithms.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        String digits = "12";
        List<String> ans = new ArrayList<>();
        String[] keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        helper(digits, new StringBuilder(), keypad, ans, 0);

    }

    public static void helper(String digits, StringBuilder sb, String[] keypad,List<String> ans, int idx) {
        if (digits.length() == idx) {
            ans.add(sb.toString());
            return;
        }
        int key = digits.charAt(idx) - '0';
        String keyNum = keypad[key];
        for (int i = 0; i < keyNum.length(); i++) {
            sb.append(keyNum.charAt(i));
            helper(digits, sb, keypad, ans, idx + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
