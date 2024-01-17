package Thread;

import java.util.Scanner;

class Alpha extends Thread {
    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n = sc.nextByte();
        System.out.println("Enter sencond number");
        int m = sc.nextByte();
        int result = n+m;
        System.out.println(result);
    }
}

class Alpha2 extends Thread {
    @Override
    public void run(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class thread {


    public static void main(String[] args) {


        System.out.println("Main thread");
        Alpha a = new Alpha();
        a.start();
        Alpha2 b = new Alpha2();
        b.start();


    }
}
