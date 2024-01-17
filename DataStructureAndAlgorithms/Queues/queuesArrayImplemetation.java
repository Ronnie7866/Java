package DataStructureAndAlgorithms.Queues;

public class queuesArrayImplemetation {

    public static class queuesArray{
        int front = 0;
        int rear = 0;
        int size = 0;
        int[] arr = new int[10];

        public void add(int val){
            if (size == 0) arr[0] = val;
            else{
                arr[++rear] = val;
            }
            size++;
        }

        public boolean isEmpty(){
            if (size == 0) return true;
            else return false;
        }
        public int remove(){ // front-->   1 2 3 4 5  <-- rear
            front++;
            size--;
            return arr[front-1];
        }

        public void display(){
            for(int i = front; i <= rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        public int peek(){
            return arr[front];
        }

        public int getsize(){
            return size;
        }
    }

    public static void main(String[] args) {
        queuesArray q = new queuesArray();
        q.display(); //  empty
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.display(); // 1 2 3 4 5 6 7 8
        q.remove(); // 2 3 4 5 6 7 8
        q.display();
        System.out.println(q.peek()); // 2
        System.out.println(q.isEmpty()); // false;
        System.out.println(q.getsize());
        q.remove();
        System.out.println(q.getsize());
        System.out.println(q.getClass());
    }
}
