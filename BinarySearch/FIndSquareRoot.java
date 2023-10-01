package BinarySearch;

public class FIndSquareRoot {

    static int sqrt(int x){
        int start = 0, end = x;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start)/2;
            long val = (long) mid * mid;
            if (val == x){
                return mid;
            } else if (val > x) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(sqrt(x));
    }
}
