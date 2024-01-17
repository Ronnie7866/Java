package DataStructureAndAlgorithms.NumberSystem;

public class BinaryToDecimal {

    private static int toDecimal(int n) {
        int ans = 0;
        int power = 1;
        while (n > 0) {
            int unitDigit = n % 10;
            ans += (unitDigit * power);
            n /= 10;
            power *= 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 110011;
        int ans = toDecimal(n);
        System.out.println(ans);
    }
}
