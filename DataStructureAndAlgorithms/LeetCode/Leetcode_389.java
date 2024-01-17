package DataStructureAndAlgorithms.LeetCode;
public class Leetcode_389 {

    private static char diff(String s, String t) {
        if (s.isEmpty()) return t.charAt(0);
        if (t.isEmpty()) return s.charAt(0);
        char ans = '.';

        int i = 0;
        int j = 0;

        while (i != s.length() && j != t.length()) {
            i++;
            j++;
        }
        if (i == s.length()) {
            ans = t.charAt(t.length() - 1);
            return ans;
        }
        if (j == t.length()) {
            ans = s.charAt(s.length() - 1);
            return ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "";
        String t = "y";
        System.out.println(diff(s,t));
    }
}
