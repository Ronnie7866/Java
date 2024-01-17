package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,9,8,7,2,4,5,8,9,8,8);
//        Stream<Integer> s = arr.stream();
//        Stream <Integer> sort = s.sorted();
//        Stream<Integer> fil = sort.filter(n -> n % 2 == 0);
//        Stream <Integer> m = fil.map(n -> n*2);
//        m.forEach(i -> System.out.println(i));

        // method chaining kr skte h agr method ka return type same hai to
        Stream<Integer> s = arr.stream().sorted().filter(n->n%2==0).map(n->n*2);
        s.forEach(n -> System.out.println(n));
    }
}
