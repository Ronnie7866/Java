package StreamAPI;
import java.time.*;
import java.util.Objects;

public class date {
    public static void main(String[] args) {
        LocalDate o = LocalDate.now();
        System.out.println(o);
        System.out.println(o.getDayOfMonth());
        System.out.println(o.getDayOfWeek());
        System.out.println(o.getDayOfYear());


        LocalTime l = LocalTime.now();
        System.out.println(l);
        System.out.println(l.getNano());
        System.out.println(l.getHour());
        System.out.println(l.getMinute());
    }
}
