package Stacks;

import java.util.Stack;

public class nextGreaterElement {

    public static int[] func(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[n-1] = -1;
        st.push(arr[n-1]);
        for(int i = 2*n-2; i>=0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i%n]) {
                st.pop();
            }
            if(st.isEmpty()) ans[i%n] = -1;
            else{
                ans[i%n] = st.peek();
            }
            st.push(arr[i%n]);
        }
        return ans;
    }

    public static int[] prevSmaller(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[0] = -1;
        st.push(0);
        for(int i = 1; i<n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public static int[] nextSmaller(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[n-1] = -1;
        st.push(n-1);
        for(int i = n-2; i>=0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public static int[] func2(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[n-1] = -1;
        st.push(n-1);
        for(int i = n-2; i>=0; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,4,6,3,5};
        for (int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
        int[] ans = nextSmaller(arr);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
