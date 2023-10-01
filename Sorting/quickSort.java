package Sorting;

public class quickSort {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    static int partition(int[] arr, int start, int end){
        int pivot = arr[start];
        int count = 0;
        for (int i = start + 1; i < end; i++){
            if (arr[i] < pivot) count++;
        }
        int pivotIndex = start + count;
        swap(arr,start,pivotIndex);

        int i = start, j = end;

        while (i < pivotIndex && j > pivotIndex){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if (i < pivotIndex && j > pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    static void sort(int[] arr, int start, int end){
        if (start >= end) return;
        int pivotIndex = partition(arr, start, end);
        sort(arr, start, pivotIndex-1);
        sort(arr,pivotIndex+1, end);
    }

    public static void main(String[] args) {
        int[] arr = {5,4,8,1,6,9};

        System.out.println("Array before sorting");
        printArray(arr);

        System.out.println();

        sort(arr,0,arr.length-1);

        System.out.println("Array after sorting");
        printArray(arr);
    }
}
