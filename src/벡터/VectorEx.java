package 벡터;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//Vector: List 인터페이스를 상속 받아 만든 리스트 타입의 자료구조
//벡터는 동기화기능을 제공하므로 멀티쓰레드 환경에서 안전
//하지만 성능이 ArrayList에 비해서 떨어지므로 특별한경우가 아니면 어레이리스트를 사용
public class VectorEx {
    public static void main(String[] args) {
        List<NameCard> list = new LinkedList<>();
        list.add(new NameCard("카즈하", "kzh@gmail.con", "01012345678", "르세라핌"));
        list.add(new NameCard("김채원","@@","01011111111","르세라핌"));

        for(NameCard name : list) {
            System.out.println("name: "+ name.name);
            System.out.println("mail "+name.email);
            System.out.println("phone "+ name.phone);
            System.out.println("group "+ name.job);
        }
    }
}

class NameCard {
    String name;
    String email;
    String phone;
    String job;

    public NameCard(String name, String email, String phone, String job) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.job = job;
    }
}
