package RecursionOnArrays;

public class sortedByRecursion {

    static int lastIndex_Recursion(int[] arr, int x, int i){
        if(i == arr.length)
            return -1;
        int lastIndex = lastIndex_Recursion(arr, x, i+1);
        if(arr[i]==x && i>lastIndex)
            return i;
        else
            return lastIndex;
    }


    static boolean isSorted(int arr[], int idx) {
        if (arr.length-1 == idx) return true;
       if (arr[idx] < arr[idx+1])
            return isSorted(arr,idx+1);

       else
           return false;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4,4,4,4,4,4,4, 5};
    }
}
