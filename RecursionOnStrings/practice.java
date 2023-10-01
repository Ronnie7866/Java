package RecursionOnStrings;

import java.util.Scanner;

public class practice {

    static int maxInArray(int arr[], int idx){
        if (arr.length == idx) return 0;
        int smallAns = maxInArray(arr,idx+1);
        return Math.max(smallAns,arr[idx]);
    }

    static int sumOfArray(int[] arr, int idx) {
        if (idx == arr.length) return 0;
        int smallAns = sumOfArray(arr,idx+1);
        return smallAns + arr[idx];
    }

    static int findOccurence(int arr[], int idx, int target) {
        // base case
        if (arr.length == idx) return -1;
        // self work
        if (arr[idx] == target) return idx;
        // recursive work
        return findOccurence(arr, idx + 1, target);
    }

    static int findLastOccurence(int arr[], int target, int idx) {
        //base case
        if (idx == 0) return -1;
        // self work
        if (arr[idx] == target) return idx;
        // recursive work
        return findLastOccurence(arr, target, idx - 1);
    }

    static void arr(int[] arr, int idx) {
        if (arr.length == idx) return;
        System.out.println(arr[idx]);
        arr(arr, idx + 1);
        return;
    }

    static int seriesSum(int n) {
        if (n == 0) return 0;
        if (n % 2 == 0) {
            return seriesSum(n - 1) - n;
        } else {
            return seriesSum(n - 1) + n;
        }
    }

    static int sumOfDigits(int n) { // 1 2 3 4 5
        if (n >= 0 && n <= 9) return n;
        return sumOfDigits(n / 10) + n % 10;
    }

    static int pow(int x, int y) {
        if (y == 0) return 1;
        return x * pow(x, y - 1);
    }

    static int fibo(int n) {
        if (n == 0 || n == 1) return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int smallAns = factorial(n - 1);
        return n * smallAns;
    }

    static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) return true;
        return str.charAt(left) == str.charAt(right) && isPalindrome(str, str.charAt(left + 1), str.charAt(right - 1));
    }

    static String reverse(String str, int idx) {
        if (str.length() == idx) return "";
        String smallAns = reverse(str, idx + 1);
        char curr = str.charAt(idx);
        return smallAns + curr;
    }

    public static void PSSQ(String str, String currAns){
        if (str.isEmpty()) {
            System.out.print(currAns + " ");
            return;
        }
            char curr = str.charAt(0);
            String remString = str.substring(1);
            PSSQ(remString, currAns + curr);
            PSSQ(remString, currAns);
            return;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    }
}
