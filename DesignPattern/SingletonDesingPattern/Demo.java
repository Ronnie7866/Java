package DesignPattern.SingletonDesingPattern;

public class Demo {
    public static void main(String[] args) {
        Jalebi j = Jalebi.getJablebi();
        System.out.println(j);
        Jalebi s = Jalebi.getJablebi();
        System.out.println(s);
        System.out.println();
        System.out.println();

        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1);
        Samosa s2 = Samosa.getSamosa();
        System.out.println(s2);
    }
}
