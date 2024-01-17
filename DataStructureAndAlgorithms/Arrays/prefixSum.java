package DataStructureAndAlgorithms.Arrays;

import java.util.Scanner;

public class prefixSum {

    static int findArraySum(int arr[]){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalPartition(int arr[]){
        int totalSum = findArraySum(arr);
        int prefSum = 0;

        for (int i = 0; i < arr.length; i++){

            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if (prefSum == suffixSum){
                return true;
            }
        }
        return false;

    }

    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    static int [] prefSumArray(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc .nextInt();
        int [] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        int []sum = prefSumArray(arr);
//        System.out.println("Enter number of queries: ");
//
//        int m = sc.nextInt();
//
//        while (m -- > 0){
//            System.out.println("Enter Array Range:");
//            int st = sc.nextInt();
//            int end = sc.nextInt();
//           int rangeSum = sum[end] - sum[st-1];
//            System.out.println("The range sum is : " + rangeSum);
//        }


        
    }
}
