package RecursionOnArrays;

public class arrayRecursion {
    static void printArray(int arr[], int idx){
        //base case
        if (idx == arr.length) return;
        // self work
        System.out.println(arr[idx]);
        // recursive work
        printArray(arr,idx+1);
        return;
    }

    static int sumOfArrayElements(int [] arr, int idx){
        // base case
        if (idx == arr.length) return 0;
        // recursive work
        int smallAns = sumOfArrayElements(arr,idx+1);
        // self work
        return smallAns + arr[idx];
    }


    static int maxInArray(int arr[],int idx){
        //base case
        if (idx == arr.length) return 0;
        //recursive work
        int smallAns = maxInArray(arr, idx+1);
        // self work
        return Math.max(smallAns,arr[idx]);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,5,9,15,2,16};
        int idx = 0;
        System.out.println(maxInArray(arr,idx));
    }
}
