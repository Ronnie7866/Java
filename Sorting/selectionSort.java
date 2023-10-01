package Sorting;

public class selectionSort {

    static void selectionsort(int[] arr){
        int n = arr.length;

        // i represent current index

        for (int i = 0; i < n-1; i++){
            int minIndex = i;

            // find the minimum element in the unsorted Array

            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            // swap current and smallest Element --> swap i and minIndex

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[]arr = {5, 6, 8, 2, 0, 1, 9};
        selectionsort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
