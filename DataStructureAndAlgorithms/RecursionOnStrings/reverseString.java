package DataStructureAndAlgorithms.RecursionOnStrings;

import java.util.Scanner;

public class reverseString {

    static boolean isPalindrome(String str, int left, int right){
        if (left >= right) return true;
        return str.charAt(left) == str.charAt(right) && isPalindrome(str,left+1,right-1);
    }

    static String reverse(String str, int idx){
        if (idx == str.length()) return "";
        String smallAns = reverse(str,idx+1);
        return smallAns + str.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String rev = reverse(str,0);
//        if (rev.equals(str)){
//            System.out.println("yes");
//        }else {
//            System.out.println("no");
//        }
        System.out.println(isPalindrome(str,0, str.length()-1));
    }
}
