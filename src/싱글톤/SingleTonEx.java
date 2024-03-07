package 싱글톤;
//싱글톤: 단 한개의 객체만 생성되도록 하는 패턴
// 사용하는 이유는 메모리 절약 데이터공유목적스프링부트에서 사용,bean , 데이터공유목적
public class SingleTonEx {
    public static void main(String[] args) {
        Test test1 = new Test();
        test2 test2 =new test2();
        test1.setInfo("동그라미",27);
        test2.viewInfo();


    }
}
