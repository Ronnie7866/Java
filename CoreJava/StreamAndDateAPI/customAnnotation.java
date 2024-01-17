package StreamAndDateAPI;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface CricketPlayer{
    String country() default  "India";
    int age() default  34;
}
@CricketPlayer
class Virat {
    int innnings;
    int runs;

    void setInnings(int Innings){
        this.innnings = Innings;
    }
    int setInning(){
        return innnings;
    }
    void setRuns(int runs){
        this.runs = runs;
    }
    int getRuns(){
        return runs;
    }
}

public class customAnnotation {
    public static void main(String[] args) {
        Virat v = new Virat();
        v.setRuns(1000);
        System.out.println(v.getRuns());
        v.setInnings(500);
        System.out.println(v.setInning());


        Class vir = v.getClass();
        Annotation an = vir.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer) an;

        String cty = cp.country();
        int a = cp.age();
        System.out.println(cty);
        System.out.println(a);
    }
}
