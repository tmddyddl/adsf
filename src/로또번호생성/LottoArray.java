package 로또번호생성;

import java.util.ArrayList;
import java.util.List;

//ArrayList사용법: 배열과 유사하지만 크기를 정하지 않고 사용 가능
public class LottoArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //컬렉션프레임워크에서 다룰 예정
        int tmp = 0 ; //생성된 로또번호를 담는 변수
        while (true) {
            tmp = (int)((Math.random()*45)+1);
            if(!list.contains(tmp)) list.add(tmp);
            if(list.size() == 6 )break;
        }
        System.out.println(list);
    }
}
