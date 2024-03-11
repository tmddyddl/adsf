package 디폴트메소드;

import java.util.Scanner;

// 디폴트 메소드 : 인터페이스에서 있는 구현 메소드를 의미
//메소드앞에 dafault 예약어 사용
//{ } 구현부가 존재해야 함.
public class Dafault {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("재폼선택: 1.티비 2. 오디오");
        int sel = sc.nextInt();
        remotecontrol remotecontrol;
        if (sel == 1) {
            remotecontrol = new TV();
            remotecontrol.turnon();
            remotecontrol.setvolume(20);
            remotecontrol.setmute(true);
            디폴트메소드.remotecontrol.changebatter();
        } else {
            remotecontrol = new audio();
            remotecontrol.turnon();
            remotecontrol.setvolume(30);
            remotecontrol.setmute(true);
        }
        remotecontrol rc = new remotecontrol() {
            int volume;
            @Override
            public void turnon() {
                System.out.println("플스 킴");
            }

            @Override
            public void turnoff() {
                System.out.println("플스 끔");
            }

            @Override
            public void setvolume(int voulume) {
                if (voulume > remotecontrol.MAXV) {
                    this.volume = remotecontrol.MAXV;
                } else if (voulume < remotecontrol.MINV) {
                    this.volume = remotecontrol.MINV;
                } else {
                    this.volume = voulume;
                }
                System.out.println("현재 플스 볼륨:" + this.volume);
            }
        };
        rc.turnon();
        rc.setvolume(100);

    }
}
