package Interface;

interface car{
    public void drive(int avg, int ts);
}
public class innerclass {
    public static void main(String[] args) {
        car a = (avg,ts) -> System.out.println("Driving..." + avg + ts);
        a.drive(16,140);
    }
}
