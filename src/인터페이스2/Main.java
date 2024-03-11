package 인터페이스2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Cocoa cocoa = new Cocoa("장원영");
       cocoa.writemsg("오늘은 날씨가 따뜻해요. 봄이오나봐요");
       Network adapter = null;
       Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 1. 와이파이 2.5G ");
        int sel = sc.nextInt();
        if(sel == 1) adapter = new WiFI();
        else adapter = new Fiveg();
        cocoa.send(adapter);



    }
}
