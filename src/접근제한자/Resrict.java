package 접근제한자;


public class Resrict {
    public void seoul() {
        System.out.println("서울 메소드는 public입니다");
    }
    void busan() {
        System.out.println("부산 메소드는 defalt입니다");

    }
    protected void inchun(){
        System.out.println("인천메소드는 프로텍트입니다");
    }
    private  void daegu() {
        System.out.println("대구는 프라이빗");
    }
}

class City{

}