package 제네릭프린터;

import java.security.PublicKey;

//프린터에 사용될재료
public class Powder {
    public void  doPreinting () {
        System.out.println("파우더재료로출려합니다");
    }
    @Override
    public String toString() {
        return "재료는 파우더입니다";
    }
}
