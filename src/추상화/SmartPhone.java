package 추상화;

public class SmartPhone extends Phone {
    public SmartPhone(String name) {
        super(name);
    }
    @Override
    void call() {
        System.out.println("부모의 요청으로 통화기능을 완성하겠습니다");
    }
    public void internet() {
        System.out.println("인터넷을 검색합니다.");
    }
}
