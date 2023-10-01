package Stacks;

import java.util.Stack;

public class insertAtBottomByRecursion {

    static void insertion(Stack<Integer> st, int val){
        if (st.isEmpty()){
            st.push(val);
            return;
        }
        int top  = st.pop();
        insertion(st,val);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        insertion(st,500);
        System.out.println(st);
    }
}
