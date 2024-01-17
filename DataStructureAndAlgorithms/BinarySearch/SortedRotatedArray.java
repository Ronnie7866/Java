package DataStructureAndAlgorithms.BinarySearch;

public class SortedRotatedArray {
    static int searchIndex(int[] arr, int target){
        int n = arr.length;
        int start = 0, end = n-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < arr[end]) { // mid to end is sorted
                if (target > arr[mid] && target <= arr[end]){ // check if target is present in sorted array or not
                    start = mid+1;
                }
                else{
                    end = mid - 1;
                }
            }
            else  { // start to mid is sorted
                if (target >= arr[start] && target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,1,2};
        int target = 7;
        System.out.println(searchIndex(arr,target));
    }
}
