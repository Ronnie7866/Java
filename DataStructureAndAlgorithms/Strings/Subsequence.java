package DataStructureAndAlgorithms.Strings;

public class Subsequence {
    public static void main(String[] args) {
        String s = "abcdef";
        subSequence("", s);
    }

    private static void subSequence(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSequence(ch + p, up.substring(1));
        subSequence(p, up.substring(1));

    }
}
