package DataStructureAndAlgorithms.RecursionOnArrays;

public class linearSearchByRecursion {

    static boolean search(int arr[], int target, int idx){
        //base case
        if (idx == arr.length) return false;
        // self work
        if (arr[idx] == target) return true;
        // recursive work
        return search(arr,target,idx+1);


    }

    static int searchIDX(int arr[], int target, int idx){
        //base case
        if (idx == arr.length) return -1;
        // self work
        if (arr[idx] == target) return idx;
        // recursive work
          return searchIDX(arr,target,idx+1);
    }

    static void findIndices(int arr[], int target, int idx){
        // base case
        if (idx == arr.length) return;
        // self work
        if (arr[idx] == target){
            System.out.print(idx + " ");
        }
        // recursive work
        findIndices(arr,target,idx+1);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,5,3,6,5,10,5,5,20};
        int target = 20;
        System.out.println(searchIDX(arr,target,0));
    }
}
