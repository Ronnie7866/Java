package Sorting;

public class problemsOnSortingAlgorithmsII {

    static void sortZeroesOnesAndTwos(int[] arr){
        int count_0 = 0, count_1 = 0, count_2 = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) count_0++;
            else if (arr[i] == 1) count_1++;
            else if (arr[i] == 2) count_2++;
        }
        int k = 0;

        while (count_0 > 0) {
            arr[k++] = 0;
            count_0--;
        }
        while (count_1 > 0) {
            arr[k++] = 1;
            count_1--;
        }
        while (count_2 > 0) {
            arr[k++] = 2;
            count_2--;
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void partition(int[] arr){
        int left = 0, right  = arr.length - 1;
        while (left < right){
            while (arr[left] < 0) left++;
            while (arr[right] >= 0) right--;
            if (left < right){
                swap(arr,left,right);
            }
        }
    }

    static void printArr(int[] arr){
        for (int val : arr){
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 0, 1, 0, 2, 0, 2, 2};

        System.out.println("Array before sorting");
        printArr(arr);

        System.out.println();

        sortZeroesOnesAndTwos(arr);

        System.out.println("Array after sorting");
        printArr(arr);
    }
}
