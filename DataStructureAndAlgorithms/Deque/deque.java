package DataStructureAndAlgorithms.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        System.out.println(dq);
        dq.add(1);
        System.out.println(dq);
        dq.add(2);
        System.out.println(dq);
        dq.addFirst(0);
        System.out.println(dq);
        dq.offer(3);
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);
    }
}
