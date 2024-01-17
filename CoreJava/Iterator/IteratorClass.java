package CoreJava.Iterator;

import java.util.*;

public class IteratorClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(87);
        list.add(345);
        list.add(35);
        list.add(23);
        list.add(456);
        list.add(7);
        list.add(86);
        list.add(2);
        list.add(45);
        list.add(8);
        System.out.println(list.size());
        System.out.println(list);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Integer k = (int)itr.next();
            System.out.print(k + " ");
        }
        System.out.println();

        for (Integer integer : list) {
            Integer k = (int) integer;
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println(list.size());

        ListIterator<Integer> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            Integer k = (int) it.previous();
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println(list.size());
    }
}
