package DesignPattern.SingletonDesingPattern;

public class Samosa {
    private Samosa(){}
    private static Samosa samosa = new Samosa();

    public static Samosa getSamosa(){ // eager way of creating singleton object
        return samosa;
    }
}
