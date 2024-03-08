package 인터페이스심화;

public interface NetworkAdapter {
    void connect(); //public abstrac자동추가

}

class Wifi implements NetworkAdapter {
    String company;
    Wifi(String com) {
        company = com;
    }

    @Override
    public void connect() {
        System.out.println(company+"WIFI에 연결되었습니다");

    }
}
class FIVEG implements NetworkAdapter {
    String company;
    FIVEG(String com) {
        company = com;
    }

    @Override
    public void connect() {
        System.out.println(company+"5G에 연결되었습니다");

    }
}
class LTE implements NetworkAdapter {
    String company;
    LTE(String com) {
        company = com;
    }

    @Override
    public void connect() {
        System.out.println(company+"LTE에 연결되었습니다");

    }
}

