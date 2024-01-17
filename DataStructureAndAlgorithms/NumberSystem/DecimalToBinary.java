package DataStructureAndAlgorithms.NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {

    private static int toBinary(int n) {
        int ans = 0;
        int power = 1; // power of 10
        while (n > 0) {
            int parity = n % 2;// remainder
            ans += (parity * power);
            power *= 10;
            n /= 2; // binary number h is liye 2 se divide ho rha h | decimal hota to by 10 hota
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number that you want to convert in Binary Format:");
        int n = scanner.nextInt();
        int ans = toBinary(n);
        System.out.println(ans);
    }
}
