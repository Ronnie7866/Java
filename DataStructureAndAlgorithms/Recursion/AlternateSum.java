package DataStructureAndAlgorithms.Recursion;

public class AlternateSum {
    public static void main(String[] args) {
        int n = 10;
        int ans = function(n);
        System.out.println(ans);
    }

    private static int function(int n) {
        if (n == 0)
            return 0;

        if (n % 2 == 0) {
            return function(n-1) - n;// pahle call lgaya bad me kam kiya taki neeche se value add ya sub hona shuru ho
        }
        return function(n - 1) + n;
    }
}
