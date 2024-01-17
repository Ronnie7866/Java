package DataStructureAndAlgorithms.LinkedList;

public class basicsOfLinkedList {

    public static class node{
        int data;
        node next;
        static int size = 0;
        node(int val){
            data = val;
            size++;
        }

        static void printLinkedListByRecursion(node a){
            if (a == null) return;
            System.out.print(a.data + " ");
            printLinkedListByRecursion(a.next);
        }

        public static int length(node head){
            int count = 0;
            while (head != null){
                count++;
                head = head.next;
            }
            return count;
        }

    }

    public static void main(String[] args) {
        node a = new node(5);
        node b = new node(10);
        node c = new node(15);
        node d = new node(20);
        node e = new node(25);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        node temp  = a;
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);


        // PRINT LINKED LIST WITH lOOPS
//        for (int i = 0; i < 5; i++){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }

        // PRINT LINKED LIST WITH RECURSION
        //node.printLinkedListByRecursion(a);

        // FINDING LENGTH OF A LINKED LIST
        //System.out.println(node.length(a));

        // FINDING LENGTH OF A LINKED LIST WITH RECURSION
        // System.out.println(node.lengthRecursively(a));


    }
}
