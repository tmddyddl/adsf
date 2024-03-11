package 인터페이스2;

public interface Network {
    void connect(); //public abstract가 모조건 추가됨
    void send(String msg);
}

class WiFI implements Network{

    @Override
    public void connect() {
        System.out.println("와이파이에연결되엇습니다");
    }

    @Override
    public void send(String msg) {
        System.out.println("와이파이>>"+msg);
    }
}
class Fiveg implements Network {

    @Override
    public void connect() {
        System.out.println("5g에연결되엇습니다");
    }

    @Override
    public void send(String msg) {
        System.out.println("5g>>" + msg);
    }
}

class lte implements Network{

    @Override
    public void connect() {
        System.out.println("lte연결되엇습니다");
    }

    @Override
    public void send(String msg) {
        System.out.println("lte>>"+msg);
    }}