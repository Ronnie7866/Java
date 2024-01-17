package DataStructureAndAlgorithms.LinkedList;

public class implementation {

    public static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int data){
            Node temp = new Node(data);
            if (head == null){
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void displayLinkedList(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        void insertAtBeginning(int data){
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp;
            }
            else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void deleteAt(int index){
            if (index == 0){
                head = head.next;
                return;
            } if (index == size-1) {
                Node temp = head;
                for (int i = 0; i < index-1; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                tail = temp;
                size--;
            }
            else {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }

        int getElement(int index){
            Node temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void insertAtIndex(int index, int value){
            if (index == 0){
                insertAtBeginning(value);
                return;
            } else if (index == size) {
                insertAtEnd(value);
                return;
            }
            Node newVal = new Node(value);
            Node temp = head;
            for (int i = 0; i < index-1; i++){
                temp = temp.next;
            }
                newVal.next = temp.next;
            temp.next = newVal;
            size++;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(7);
        Node d = new Node(9);
        Node e = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ll.displayLinkedList();
    }
}
