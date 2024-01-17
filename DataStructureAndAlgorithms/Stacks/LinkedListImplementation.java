package DataStructureAndAlgorithms.Stacks;

public class LinkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class linkedListStack{
        Node head = null;
        int size = 0;

        void push(int val){
            Node temp = new Node(val);
            temp.next = head; // queue conn tail.next = temp
            head = temp;      //   ''         tail = temp
            size++;
        }
        void recprint(Node head){
            if (head == null) return;
            recprint(head.next);
            System.out.print(head.val + " ");
        }

        void revPrint(){
            recprint(head);
        }
        int pop(){
            if (head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = head.val;
            head = head.next;
            size--;
            return head.val;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }
        void peek(){
            System.out.print(head.val);
        }
        int size(){
            return size;
        }

    }
    public static void main(String[] args) {
        linkedListStack st = new linkedListStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.revPrint();
        System.out.println();
        st.pop();
        st.revPrint();
        System.out.println();
        st.peek();
        System.out.println();
        System.out.println("Size" + st.size());

    }
}
