package Sorting;

public class countSort {

    static void printArray(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    static int findMinValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void countSortingStable(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMinValue(arr);
        int[] frequency = new int[max+1];
        // make frequency array
        for (int i = 0; i < arr.length; i++){
            frequency[arr[i]]++;
        }
        // make prefix frequency array
        for (int i = 1; i < frequency.length; i++){
            frequency[i] += frequency[i-1];
        }
        // find the index of each element in the original array in put it in the output array
        for (int i = n-1; i >= 0; i--){
            int idx = frequency[arr[i]] - 1;
            output[idx] = arr[i];
            frequency[arr[i]]--;
        }
        // copy output to original array
        for (int i = 0; i < n; i++){
            arr[i] = output[i];
        }

    }

    static void countSorting(int[] arr){
        int max = findMinValue(arr);
        int[] frequency = new int[max+1];
        for (int i = 0; i < arr.length; i++){
            frequency[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < frequency.length; i++){
            for (int j = 0; j < frequency[i]; j++){
                arr[k++] = i;
            }
        }
    }


    public static void main(String[] args) {

        System.out.println("Array before Sorting");
        int[] arr = {5,4,2,1,8,2,0,1};
        printArray(arr);

        System.out.println();

        countSortingStable(arr);
        System.out.println("Array after Sorting");
        printArray(arr);
    }
}
