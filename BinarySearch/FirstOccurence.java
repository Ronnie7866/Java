package BinarySearch;

public class FirstOccurence {

    static int firstOccurence(int[] arr,int start, int end, int target){
        int fo = -1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                fo = mid;
                end = mid-1;
            } else if (target < arr[mid]) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return fo;
    }

    public static void main(String[] args) {
        int[] arr = {1 ,2 ,2 ,5 ,5 ,5 ,6 ,9,6};
        System.out.println(firstOccurence(arr,0,arr.length-1,6));
    }
}
