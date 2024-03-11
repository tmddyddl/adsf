package 중첩인터페이스;

public class btt {
    OnClickListener listener; //OnClickListener인터페이스에대한 참조변수
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
    void touch() {
        listener.onClick(); //구현객체의 onClick()메서드를 호출
    }
    interface  OnClickListener {
        void onClick(); //추상메소드
    }
}
