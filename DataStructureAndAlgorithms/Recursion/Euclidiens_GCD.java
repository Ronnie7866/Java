package DataStructureAndAlgorithms.Recursion;

public class Euclidiens_GCD {

    private static int GCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a < b) {
            return GCD(a, b % a);
        } else return GCD(a % b, b);
    }
    public static void main(String[] args) {
        int a = 40, b = 100;
        int ans = GCD(a,b);
        System.out.println(ans);
    }
}
