package DataStructureAndAlgorithms.Recursion;

import java.util.Scanner;

public class fibo {

    static int fibo(int n){
        if (n == 0 || n == 1) return n;

        return fibo(n-1) + fibo(n-2);
        }


    static void printIncreasing(int n){
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);

    }

    static int factorial(int n){
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
        for (int i = 0; i < n; i++) {
            System.out.println(fibo(i));
        }
    }
}
