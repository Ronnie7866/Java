package DataStructureAndAlgorithms.Stacks;
import java.util.*;
public class stacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        while (!st.isEmpty()){
            gt.push(st.pop());
        }
        System.out.println(gt);
    }
}
