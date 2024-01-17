package DataStructureAndAlgorithms.Sorting;

public class mergeSort {

    static void merge(int[] arr, int left, int mid, int right){
        int n = arr.length;
        int n1 = mid-left+1;
        int n2 = right-mid;
        int[] firstHalf = new int[n1];
        int[] secondHalf = new int[n2];
        for (int i = 0; i < n1; i++) firstHalf[i] = arr[left+i];
        for (int j = 0; j < n2; j++) secondHalf[j] = arr[mid+1+j];
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (firstHalf[i] <= secondHalf[j])
                arr[k++] = firstHalf[i++];
                else
                arr[k++] = secondHalf[j++];
        }
            while (i < n1)
                arr[k++] = firstHalf[i++];
            while (j < n2)
                arr[k++] = secondHalf[j++];
        }

    static void sorting(int[] arr, int left, int right){
        int mid = (left + right)/2;
        if (left == right) return;
        sorting(arr,left,mid);
        sorting(arr,mid+1,right);
        merge(arr,left,mid,right);

    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 9, 2, 1};
        sorting(arr,0,arr.length-1);
        for (int val : arr){
            System.out.print(val + " ");
        }
    }
}
