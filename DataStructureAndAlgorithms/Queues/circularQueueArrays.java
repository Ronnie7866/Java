package DataStructureAndAlgorithms.Queues;

public class circularQueueArrays {

    public static class CQA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];
        int n = arr.length;

        public void add(int x) throws Exception {
            if(size == n){
                throw new Exception("Queue is Full!");
            }
            else if(size == 0){
                f = r = 0;
                arr[0] = x;
            }
            else if(r < n-1){
                arr[++r] = x;
            }
            else if(r == n-1){
                r = 0;
                arr[0] = x;
            }
            size++;
        }
        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            }
            else if(f==n-1){
                int val = arr[f];
                f = 0;
                size--;
                return val;
            }
            else{
                int val = arr[f];
                f++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            }
            else{
                return arr[f];
            }
        }
        public void display(){
            if (f<r){
                for (int i = f; i <= r; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            else{
                for (int i = f; i < n; i++){
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        CQA q = new CQA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.add(6);
        q.display();
        System.out.println();
        for (int i = 0; i < q.arr.length;i++){
            System.out.print(q.arr[i] + " ");
        }
    }
}
