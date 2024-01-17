package DataStructureAndAlgorithms.LeetCode;

public class LeetCode_442 {

    public static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char take = up.charAt(0);
        subseq(p + take, up.substring(1));
        subseq(p,up.substring(1));
    }

    public static void main(String[] args) {
        subseq("", "abc");
    }
}
