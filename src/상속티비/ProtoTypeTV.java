package 상속티비;

public class ProtoTypeTV {
    boolean isPower;
    int channel;
    int volume;
    public ProtoTypeTV() {//생성자는 반환티입이 없고 클래스이름과 동일, 생성자의 주요 목적은 인스턴스 필드 초기화
        this.isPower = false;
        this.channel = 10;
        this.volume = 10;

    }
    //생산자 오버로딩(동일한 이름의 메소드가여러개존재하는것매개변수의 타입이나 개수가 달라야함
    public  ProtoTypeTV(boolean isPower, int channel, int volume) {
        this.isPower= isPower;
        this.channel = channel;
        this.volume = volume;

    }
    public void setChannel(int cnl) {
        if(cnl > 0 && cnl <1000) {
            channel = cnl;
        }else System.out.println("채널 설정범위가 아닙니다.");
    }
}
