package Arrays;

import java.util.Scanner;

public class Array {

    static void findMinimumElementInTheArray(int [] arr){
        int ans = 0;
        for (int i = 1; i < arr.length; i++){
            if(arr[i-1] < ans){
                ans = arr[i];
                System.out.println(ans);

            }
        }
    }

    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    static void printOnlyPositiveIntegers(int [] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                continue;
            }
            System.out.println(arr[i]);
        }
    }

    static int []  placePositiveandNegative(int [] arr){
        int n = arr.length;
        int [] array = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                array[idx++] = arr[i];
            }
        }
            for (int i = 0; i < n; i++) {
                if (arr[i] <= 0) {
                    array[idx++] = arr[i];
                }
            }
        return array;
    }

    static void absoluteDifference(int [] arr, int x){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] - arr[i] == x){
                    System.out.print("Found answer YES");
                    return;
                }
            }
        }
        System.out.print("NO");
    }

    static void findOccurence(int [] arr, int x){
        int count = 0;
        for(int amir : arr){
            if (amir == x){
                count++;
            }
        }
        System.out.println(count);
    }

    static int firstOccurence(int arr []){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }

    static int[] rotateArray(int arr[], int k){
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n-k; i < n; i++){
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void swap(int [] arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int [] arr, int i, int j){
        while (i < j){
            swap(arr,i,j);
            i++;
            j--;

        }
    }

    static void inPlaceRotateArray(int arr[], int k){
        int n = arr.length;
        k = k % n;
            reverseArray(arr,0,n-k-1);
            reverseArray(arr,n-k, n-1);
            reverseArray(arr, 0,n-1);
    }

    static int [] makeFrequencyArray(int arr[]){
        int freq[] =  new int[100005];
        for (int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc .nextInt();
        int [] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

//        int [] freque = makeFrequencyArray(arr);
//        System.out.print("Enter number of queries: ");
//        int no_of_query = sc.nextInt();
//        while (no_of_query > 0){
//            System.out.println("Enter your " + no_of_query + " query");
//            int x = sc.nextInt();
//            no_of_query--;
//            if (freque[x] > 0){
//                System.out.println("YES");
//            }
//            else System.out.print("NO");
//        }


//        System.out.print("Enter X: ");
//        int x = sc.nextInt();
//        int ans = firstOccurence(arr);
//
//        System.out.println(ans);
//        System.out.println("Enter K;");
//        int k = sc.nextInt();
//
//        int [] ans = rotateArray(arr,k);
////        printArray(ans);
//
        inPlaceRotateArray(arr, 3);
        printArray(arr);

    }
}
