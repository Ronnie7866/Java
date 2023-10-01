package Queues;

import LinkedList.implementation;

public class circularQueueLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
        }
    }
        public static class QLL{
            Node head = null;
            Node tail = null;
            int size = 0;

            public void add(int x){
                Node temp = new Node(x);
                if (head == null){
                    head = temp;
                }
                else {
                    tail.next = temp;
                }
                tail = temp;
                size++;
                tail.next = head;
            }
            public int remove(){
                int x = head.data;
                head = head.next;
                tail.next = head;
                return x;
            }
            public int peek(){
                return head.data;
            }
            public void display(){
                Node temp = head.next;
                System.out.print(head.data + " ");
                while(temp!=head){
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        QLL q = new QLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.display();
    }
}
