package Deque;

public class deque {

    public class DQ{
        int front = 0;
        int rear = 0;
        int size = 0;
        int[] arr = new int[10];

        public void addAtBeginning(int x){
            if (size == 0){
                arr[0] = x;
                rear++;
                size++;
            }
            else{

            }
        }
        public void addAtEnd(int x){
            if (size == 0){

            }
        }
    }

    public static void main(String[] args) {

    }
}
