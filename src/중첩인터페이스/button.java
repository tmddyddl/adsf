package 중첩인터페이스;
//중첩 인터페이스는 클래스 내부에 선언한 인터페이스를 의미
public class button {
    public static void main(String[] args) {
        btt btn =new btt(); // 버튼객체를 생성
        btn.setOnClickListener(new call());
        btn.touch();
        btn.setOnClickListener(new message());
        btn.touch();
    }
}
