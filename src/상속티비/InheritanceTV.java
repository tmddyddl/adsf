package 상속티비;

import java.util.Scanner;

//시제품tv를만들고 상속받아서 기능이 개선된 양산용 티비 만들기
public class InheritanceTV {
    public static void main(String[] args) {
        //ProductTV productTV = new ProductTV();
        ProductTV lgtv = new ProductTV("티비");
        lgtv.setPower(true);
        lgtv.setVolume(90);
        lgtv.setChannel(1500, true);
        lgtv.viewTV();
    }
}
