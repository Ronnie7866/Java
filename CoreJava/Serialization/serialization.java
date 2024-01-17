package Serialization;

import java.io.*;

class student implements Serializable {
    int roll_no;
    String name;
    int marks;

    student(int roll_no, String name, int marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }
    public void display(){
        System.out.println(roll_no);
        System.out.println(name);
        System.out.println(marks);
    }
}

public class serialization {
    public static void main(String[] args) throws Exception{
//        student st = new student(5,"Amir",49);
//        st.display();
//        FileOutputStream fis = new FileOutputStream("PW.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fis);
//        oos.writeObject(st);
//        oos.close();


        FileInputStream fis = new FileInputStream("PW.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        student st = (student) ois.readObject();
        st.display();
    }
}
