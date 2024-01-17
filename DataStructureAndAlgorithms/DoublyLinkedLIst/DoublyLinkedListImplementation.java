package DataStructureAndAlgorithms.DoublyLinkedLIst;

public class DoublyLinkedListImplementation {

    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }

    public static class LL{
        Node head = null;
        Node tail = null;
        Node prev = null;

        int size = 0;

        public void addAtBeginning(int x){
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            }
            else{
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            size++;
        }

        public void insertAtEnd(int val){
            Node temp = new Node(val);
            if (size == 0) {
                head = tail = temp;
            }
            else{
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
            size++;
        }

        public void insertAtIndex(int idx, int val){
            Node temp = new Node(val);
            Node s = head;
            for (int i = 0; i < idx-1; i++){
                s = s.next;
            }
            Node r = s.next;
            s.next = temp;
            temp.prev = s;
            temp.next = r;
            r.prev = temp;

        }

        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        LL l = new LL();
        l.addAtBeginning(10);
        l.addAtBeginning(20);
        l.addAtBeginning(30);
        l.insertAtEnd(50);
        l.insertAtEnd(56);
        l.insertAtIndex(3,60);
        l.display();
    }
}
