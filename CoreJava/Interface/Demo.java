package Interface;

interface Developer { // interface implent krta h dusre interface ko
    public void program();
}
interface Developer2 {
    public void program2();
}
class A implements Developer, Developer2 { // 1 class 2 interface to implements krti hai
    public void program(){
        System.out.println("Programmer is working");
    }
    public void program2(){
        System.out.println("Programmer 2 is working");
    }

}

public class Demo {
    public static void main(String[] args) {
        Developer2 d = new A();

    }
}
