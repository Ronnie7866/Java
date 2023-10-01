package Recursion;

import java.util.Scanner;

public class sum {
    static int sumOfDigits(int n) {
        if (n >= 0 && n <= 9) return n;
       return sumOfDigits(n/10) + n % 10;
    }

    static int seriesSum(int n){
        if (n == 0) return 0;

        if (n % 2 == 0){
            return seriesSum(n - 1) - n;
        }
        else {
            return seriesSum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSum(n));

    }
}
