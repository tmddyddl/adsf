package 인터페이스;

public class avante implements Car{
    @Override
    public void start() {
        System.out.println("아반떼 시동을 겁니다");
    }

    @Override
    public void stop() {
        System.out.println("아반떼 시동을 끕니다");
    }
}
