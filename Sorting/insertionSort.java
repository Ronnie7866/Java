package Sorting;

public class insertionSort {

    static void insertionsort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                // swap arr[j], arr[j-1]
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 3, 2, 0, 1};
        insertionsort(arr);
        for (int val : arr){
            System.out.println(val + " ");
        }
    }
}
