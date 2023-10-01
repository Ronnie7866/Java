package RecursionOnStrings;

public class frogJumper {

    static int best(int[] arr, int idx){
        if (idx == arr.length-1) return 0;
        int opt1 = Math.abs(arr[idx] - arr[idx+1]) + best(arr,idx+1);
        if (idx == arr.length - 2) return opt1;
        int opt2 = Math.abs(arr[idx] - arr[idx+2]) + best(arr,idx+2);
        return Math.min(opt1,opt2);
    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 20,};
        System.out.println(best(arr,0));

    }
}
