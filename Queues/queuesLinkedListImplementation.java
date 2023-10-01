package Queues;

public class queuesLinkedListImplementation {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class queuesLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x){
            Node temp = new Node(x);
            if(size == 0) {
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int peek(){
            return head.val;
        }
        public int remove(){
            int t = head.val;
            head = head.next;
            size--;
            return t;
        }
        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queuesLL q = new queuesLL();
        q.display(); // 0
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.display(); // 1 2 3 4 5 6 7 8 9
        q.remove();
        q.remove();
        q.display(); // 3 4 5 6 7 8 9
        System.out.println(q.peek()); // 3
        q.display(); // 3 4 5 6 7 8 9
        System.out.println(q.size); // 7
    }
}
