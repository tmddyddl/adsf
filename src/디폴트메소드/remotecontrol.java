package 디폴트메소드;

public interface remotecontrol {
    int MAXV = 100; // final static 이 자동 추가
    int MINV = 0;

    void turnon(); // public abstract 자동붙음

    void turnoff();

    void setvolume(int voulume);

    //디폴트 메소드추가 :JDK 8 이후 추가됨
    default void setmute(boolean mute) {
        if (mute) System.out.println("무음 처리합니다.");
        else System.out.println("무음 헤제 합니다");
    }

    //스태틱을 사용하면 remotecontrol 인터페이스 소속이므로 메소드 구현가능
    static void changebatter() {
        System.out.println("건전지를 교환합니다");
    }
}
