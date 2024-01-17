package DesignPattern.SingletonDesingPattern;

public class Jalebi {
    private static Jalebi jalebi;

    private Jalebi(){
    }

    // in multithreading there is a chance that 2 object would create hence we must use single threading by using
    // synchronised keyword

    public static Jalebi getJablebi(){ // Lazy way of creating singleton objects
        synchronized (Jalebi.class){ // block level synchronised
            if (jalebi == null) {
                jalebi = new Jalebi();
            }
        }
        return jalebi;
    }
    public static void main(String[] args) {

    }
}
