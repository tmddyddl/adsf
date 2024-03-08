package 인터페이스;

public class music implements Playable{
    @Override
    public void play() {
        System.out.println("음악을 재생합니다.");
    }
}
