package DataStructureAndAlgorithms.Sorting;

import java.util.Arrays;

public class CyclicSort {

    private static void sort(int[] arr) {
        int  i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; // 3-1 = 2
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else i++;
        }
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,1,2,3,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
