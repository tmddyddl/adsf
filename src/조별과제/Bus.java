package 조별과제;

public class Bus extends vehicle {
    public Bus() {
        연비 = 5;
        speed = 150;
        CarName = "관광버스";
        좌석수 = 20;
        연료탱크크기 = 100;
    }

    void onOff(boolean 부가기능) {
        if (부가기능) {
            super.연료탱크크기 += 30;
        }
    }
}
