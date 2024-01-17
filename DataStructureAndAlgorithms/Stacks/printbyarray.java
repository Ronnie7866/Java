package DataStructureAndAlgorithms.Stacks;

import java.util.Stack;

public class printbyarray {

    static void printbyArray(Stack<Integer> st){
        int[] arr = new int[st.size()];
        for (int i = arr.length-1; i >= 0; i--){
            arr[i] = st.pop();
        }
        for (int val : arr){
            System.out.print(val + " ");
            st.push(val);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        printbyArray(st);
        System.out.println();
        System.out.println(st);
    }
}
