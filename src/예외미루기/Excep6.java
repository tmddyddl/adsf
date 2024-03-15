package 예외미루기;

import java.io.IOException;

public class Excep6 {
    public static void main(String[] args) {
        IOSample test = new IOSample();
        try {
            test.input();
            test.output();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class IOSample {
    private int num;
    public void input() throws IOException {
        num = System.in.read();
    }
    public void output() {
        System.out.println(num);
    }
}