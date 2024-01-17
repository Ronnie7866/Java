package DataStructureAndAlgorithms.BinarySearch;

public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int n = nums.length-1;
        int start = 0, end = n;
        while(start <= end){
            int mid = start+(end-start)/2;
            if((mid == 0 || nums[mid] > nums[mid-1]) && (mid == n || nums[mid] > nums[mid+1])){
                return mid;
            }
            else if (nums[mid] < nums[mid+1]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 6;
    }
}
