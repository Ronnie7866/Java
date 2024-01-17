package DataStructureAndAlgorithms.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class questionSolvingOnStacks {

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') st.push(ch);
            else{// mtlb agr ye '(' ni to ye ')'
                if (st.isEmpty()) return false;
                else if (st.peek() == '(') st.pop();
            }
        }
        if (!st.isEmpty()) return false;
        return true;
    }

    public static String minNumOfBrackets(String str){
        Stack<Character> st = new Stack<>();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') st.push(ch);
            else{// mtlb agr ye '(' ni to ye ')'
                if (st.isEmpty()) return "";
                else if (st.peek() == '(') st.pop();
            }
        }
        if (!st.isEmpty()){
            for (int i = 0; i < st.size();i++){
                ans+=st.push(')');
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(minNumOfBrackets(str));
    }
}
