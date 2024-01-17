package comparator;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student implements Comparable <student> {
    int roll_no;
    String name;
    int marks;
    student(int roll_no,String name,int marks){
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }
        public String toString(){
            return name + " " + roll_no + " " + marks;
    }

    public int compareTo(student a){
        if(this.marks > a.marks) return 1;
        else return -1;
    }
}




//    class comparator implements Comparator<student> {
//    public int compare(student a, student b) {
//        if (a.marks > b.marks){
//            return 1;
//        }
//        else {
//            return -1;
//        }
//    }
//}


public class comparatorPractice {
    public static void main(String[] args) {
        student st2 = new student(2,"Amma",78);
        student st1 = new student(1,"Amir",41);
        student st3 = new student(3,"Adil",63);
        ArrayList<student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        System.out.println(list);

        //comparator c = new comparator();


        // LAMBDA EXPRESSION

//        Comparator<student> com = (student a, student b) -> {
//            if(a.marks > b.marks) return 1;
//            else return -1;
//        };
//        Collections.sort(list,com);
//        System.out.println(list);


        Collections.sort(list);
        System.out.println(list);
    }
}
