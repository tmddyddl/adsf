package rpggame;

import java.util.Scanner;

//상속과인터페이스적용
//쓰레드동작확인
//캐릭터를생성하고 쓰레드를통해 실시간전투진행
//적중률변경검토
public class Gamemain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("강력한 체력과 물리공격력의 전사 이름을 정하세요 : ");
        String warriorName = sc.next();
        System.out.print("궁극의 마법 능력을 지닌 마법사 이름을 정하세요 : ");
        String wizardName = sc.next();
        Character warrior =
                new Character(warriorName, 8, 2, 0.8, 0.5,40, 500);
        Character wizard =
                new Character(wizardName, 2, 28, 0.5, 0.9, 100, 250);
        GameThA gameThA = new GameThA(warrior, wizard);
        GameThB gameThB = new GameThB(warrior, wizard);
        gameThA.start();
        gameThB.start();
    }
}