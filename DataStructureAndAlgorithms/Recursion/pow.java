package DataStructureAndAlgorithms.Recursion;

import java.util.Scanner;

public class pow {

    static int powerOfDigits(int x, int y){
        if (y == 0) return 1;

        int smallAns = powerOfDigits(x,y-1);
        int Ans = smallAns*x;
        return Ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(powerOfDigits(n,m));
    }
}
