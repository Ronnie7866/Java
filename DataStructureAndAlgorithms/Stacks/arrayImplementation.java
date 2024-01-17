package DataStructureAndAlgorithms.Stacks;

public class arrayImplementation {
    public static class Stack {
        private final int[] arr = new int[5];
        int idx = 0;

        void push(int val) {
            arr[idx] = val;
            idx++;
        }
            int peek() {
            if (idx == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            System.out.println(idx);
            return arr[idx - 1];
        }

        int pop() {
            if(idx == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }
            void display(Stack st){
            for(int i = 0; i < idx; i++){
                System.out.print(arr[i] + " ");
            }
        }
        int size(){
            return idx;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display(st);
        System.out.println();
        st.pop();
        st.display(st);
        System.out.println();
        st.peek();
        System.out.println();
        System.out.println("Size" + st.size());
    }
}
