package DataStructureAndAlgorithms.BinarySearch;

public class DutchFlagAlgorigthms {
    
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void dutchFlagAlgo(int[] arr, int start, int end, int mid){
        int n = arr.length-1;
        while (mid <= end){
            if (arr[mid] == 0){
                swap(arr,start,mid);
                start++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }
            else {
                swap(arr,mid,end);
                end--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,0,0,0,1,1,1,2,2,2,0,1,2,2,2,1,0,1,0};
        dutchFlagAlgo(arr,0,arr.length-1,0);
        for (int val : arr){
            System.out.print(val + " ");
        }
    }
}
