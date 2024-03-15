package 예외5;

import java.io.FileWriter;
import java.io.IOException;

public class Excep5 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw= new FileWriter("test.txt");
            fw.write("test");
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(fw !=null) {
                try {
                    fw.close();
                }catch ( IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
