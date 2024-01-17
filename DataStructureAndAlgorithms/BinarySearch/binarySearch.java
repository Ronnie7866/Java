package DataStructureAndAlgorithms.BinarySearch;

public class binarySearch {

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

    static boolean BinarySearch(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return true;
            } else if (target < arr[mid]) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(recursiveBinarySearch(arr,0,arr.length-1,8));
    }
}
