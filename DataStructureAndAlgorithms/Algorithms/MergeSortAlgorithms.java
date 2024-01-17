package DataStructureAndAlgorithms.Algorithms;

import java.util.Arrays;

public class MergeSortAlgorithms {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int ans = countNumberOfInversion(arr, 0, arr.length-1);
        System.out.println(ans);
    }

    private static int countNumberOfInversion(int[] arr, int l, int h) {
        // divide
        int count = 0;
        if (l < h) {
            int mid = l + (h - l) / 2;
            count += countNumberOfInversion(arr, l, mid);
            count += countNumberOfInversion(arr, mid + 1, h);
            count += merge(arr, l, mid, h);
        }
        return count;
    }

    private static int merge(int[] arr, int l, int mid, int h) {
        int swap = 0;
        int[] leftArray = Arrays.copyOfRange(arr, l, mid + 1);
        int[] rightArray = Arrays.copyOfRange(arr, mid + 1, h + 1);
        int i = 0, j = 0, k = l;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else arr[k++] = rightArray[j++];
            swap += mid - l + 1 - i;
        }


        while (i < leftArray.length) arr[k++] = leftArray[i++];
        while (j < rightArray.length) arr[k++] = rightArray[j++];
        return swap;
    }
}
