package 추상화;
//추상화클래스는 객체를 생성할수없는 클래스를 의미
//추상클래스에는 추상메소드와 일반메소드가 혼용되어있음
//다중상속을 지원하지 않음
//부모가 해당메소드를 구현하지않았기때문에 추상메소드는 반드시 자식클래스에서 오버라이딩을 해서 사용해야 함
public class AbstractEX {
    public static void main(String[] args) {
        SmartPhone smartPhone= new SmartPhone("galaxy");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();
    }
}