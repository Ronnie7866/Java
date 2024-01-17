package Interface;

class X{
    void print(){
        System.out.println("In class X");
    }
    static class Y{
        void print2(){
            System.out.println("In class Y");
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        X x = new X();
        x.print();
        X.Y y = new X.Y();
        y.print2();
    }
}
