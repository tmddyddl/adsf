package 예외2번;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

public class Exception2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("../프로퍼티/database.properties"));
        }catch (FileNotFoundException e) {
            System.out.println("404 not");
        }

    }
}
