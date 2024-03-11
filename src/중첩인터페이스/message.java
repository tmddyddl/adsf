package 중첩인터페이스;

public class message implements btt.OnClickListener{
    @Override
    public void onClick() {
        System.out.println("메세지를 보냅니다");
    }
}
