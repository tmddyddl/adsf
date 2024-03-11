package 인터페이스2;

public class Cocoa {
    private String to; //상대방 이름
    private String msg; //전달할메세지
    public Cocoa(String name) {
        to = name;
    }
    public void writemsg(String msg) {
        this.msg = to +" : " +msg;
    }
    public void send(Network na)  {
        na.send(msg);
    }

}
