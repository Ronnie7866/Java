package DataStructureAndAlgorithms.BinarySearch;

public class ProblemsOnBinarySearchII {

    static boolean findTargetSecondApproach(int[][] arr, int target){
        int row = arr.length, col = arr[0].length;
        int i = 0, j = col-1;
        while (i < row && j >= 0){
            if (arr[i][j] == target) return true;
            else if (arr[i][j] > target) { // move left
                j--;
            }
            else {
                i++; // move down
            }
        }
        return false;
    }

    static boolean findTarget(int[][] arr, int target){
        int row = arr.length, col = arr[0].length;
        int n = row * col;
        int start = 0, end = n-1;

        while (start <= end){
            int mid = start + (end-start)/2;
            int midElement = arr[mid/col][mid%col];
            if (midElement == target) return true;
            else if (midElement < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 6;
        System.out.println(findTargetSecondApproach(arr,target));
    }
}
