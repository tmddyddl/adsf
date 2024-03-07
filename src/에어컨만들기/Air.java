package 에어컨만들기;

import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Air {
    public static void main(String[] args) throws InterruptedException {
        Aircock lgair = new Aircock();
        Scanner sc =new Scanner(System.in);
        int elapsedTime = 0;
        boolean isSetTemp = false;
        System.out.print("에어컨을 켜시겠습니까?(yes/no) : ");
        String isOn = sc.next();
        if(isOn.equals("yes")) {
            lgair.setPower(true);
            lgair.setAirconState();
            while(true) {
                sleep(1000);
                elapsedTime++;
                switch(lgair.getWindStep()) {
                    case 1 : if(elapsedTime >= 60) isSetTemp = true; break;
                    case 2 : if(elapsedTime >= 30) isSetTemp = true; break;
                    case 3 : if(elapsedTime >= 20) isSetTemp = true; break;
                    default : if(elapsedTime >= 61) isSetTemp = true;
                }
                if(isSetTemp) {
                    if(lgair.isHeater()) lgair.setCurrTemp(1);
                    if(lgair.isCooler()) lgair.setCurrTemp(-1);
                    lgair.airconInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }
                if(lgair.getCurrTemp() == lgair.getSetTemp()) {
                    System.out.println("에어컨을 종료 합니다.^^");
                    break;
                }
            }
        }

    }
}
