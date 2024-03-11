package 객체를배열로관리하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 인원 : ");
        int cnt = sc.nextInt();
        //NameCard[] nameCards = new NameCard[cnt]; // 객체를 저장 할 배열 생성
        List<NameCard> list = new ArrayList<>();
        System.out.println("정보 입력");
        System.out.println("----------------------");
        for (int i = 0; i < cnt; i++) {
            NameCard nameCard = new NameCard();
            System.out.print("이름 : ");
            nameCard.setName(sc.next());
            System.out.print("나이 : ");
            nameCard.setAge(sc.nextInt());
            System.out.print("이메일 : ");
            nameCard.setMail(sc.next());
            System.out.print("연락처 : ");
            nameCard.setPhoneNumber(sc.next());
            list.add(nameCard);
        }
        for (NameCard e : list) e.printInfo();
    }
}
