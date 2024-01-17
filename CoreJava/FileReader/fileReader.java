package FileReader;
import java.io.*;

public class fileReader {
    public static void main(String[] args) throws Exception{
        File f = new File("PW.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        fw.write("Amir\n");
        fw.write("Adil\n");
        fw.write("Aisha\n");
        fw.write("Mustafa\n");
        char[] arr = {'M','y' ,'n','a','m','e' ,'i','s' ,'M','o','h','a','m','m','a','d', 'A','m','i','r'};
        fw.write(arr);
        fw.close();

        FileReader fr = new FileReader(f);
        int i = fr.read();
        System.out.println((char) i);
        while(i != -1){
            System.out.print((char) i);
            i = fr.read();
        }

        PrintWriter pw = new PrintWriter(f);
        pw.println("Java");
        pw.println(150);
        pw.println(150.32);
        pw.println('A');
        pw.close();
    }
}
