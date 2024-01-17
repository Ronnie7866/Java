package DataStructureAndAlgorithms.Arrays;

import java.util.Scanner;

public class twoPointers {

    static void swap(int [] arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int [] arr){
        int i = 0, j = arr.length - 1;
        while (i < j){
            swap(arr,i,j);
            i++;
            j--;

        }
    }

    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    static void sortZeroesansOnes(int [] arr){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == 0){
                count++;
            }
        }
        for (int i = 0; i < n; i++){
            if (i < count){
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
    }

    static void sortZeroesandOneswithOneTraversal(int [] arr){
        int n = arr.length,  left = 0, right = n - 1;

        while (left < right){

            if (arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }

            if (arr[left] == 0){
                left++;
            }

            if (arr[right] == 1){
                right--;
            }
        }
    }

    static void sortOddAndEven(int arr[]){
        int n = arr.length, left = 0, right = n-1, k = 0;
        int ans[] = new int[n];

        while (left < right){

            if (arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr,left,right);
                left++;
                right--;
            }

            if (arr[left] % 2 == 0){
                left++;
            }

            if (arr[right] % 2 == 1){
                right --;
            }
        }
    }

    static int [] squareNumber(int arr[]) {
        int n = arr.length, left = 0, right = n - 1, k = 0;
        int ans[] = new int[n];

        while (left <= right) {
            if (Math.abs(arr[left]) >= Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            }

           else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
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
        int [] ans = squareNumber(arr);

        

    }
}
