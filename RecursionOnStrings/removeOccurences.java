package RecursionOnStrings;

import java.util.Scanner;

public class removeOccurences {

    static String removeA2(String str){
        if (str.isEmpty()) return "";
        String smallAns = removeA2(str.substring(1));
        char curr = str.charAt(0);
        if (curr!='a' && curr!='A') {
            return curr + smallAns;
        }
        else {
            return smallAns;
        }
    }

    static String removeA(String str, int idx) { // abacx
        // base case
        if (idx == str.length()) return "";
        // recursive work
        String smallAns = removeA(str,idx+1);
        // self work
        char curr = str.charAt(idx);
        if (curr!='a' && curr!='A') {
            return curr + smallAns;
        }
            else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeA2(str));
    }
}
