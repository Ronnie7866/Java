package DataStructureAndAlgorithms.Stacks;

import java.util.Stack;

public class insertionInStack {

    static void insertAtIndex(Stack<Integer> st, int idx, int val){
        Stack<Integer> gt = new Stack<>();
        while (st.size() > idx){
            gt.push(st.pop());
        }
        st.push(val);
        while(!gt.isEmpty()){
            st.push(gt.pop());
        }
    }

    static void insertAtBottom(Stack<Integer> st, int val){
        Stack<Integer> gt = new Stack<>();
        while (!st.isEmpty()){
            gt.push(st.pop());
        }
        st.push(val);
        while(!gt.isEmpty()){
            st.push(gt.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        insertAtBottom(st,100);
        System.out.println(st);
    }
}
