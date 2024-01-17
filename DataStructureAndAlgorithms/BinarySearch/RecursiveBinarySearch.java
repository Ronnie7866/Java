package DataStructureAndAlgorithms.BinarySearch;

public class RecursiveBinarySearch {
    static boolean recursiveBinarySearch(int[] arr, int start, int end, int target){
        if (start > end) return false;

        int mid = start + (end - start)/2;

        if (arr[mid] == target){
            return true;
        } else if (target < arr[mid]) {
            return recursiveBinarySearch(arr,start,mid-1,target);
        }
        else {
            return recursiveBinarySearch(arr,mid+1,end,target);
        }
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(recursiveBinarySearch(arr,0,arr.length-1,8));
    }
}
