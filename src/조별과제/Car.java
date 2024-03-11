package 조별과제;

public class Car extends vehicle {
    public Car() {
        연비 = 12;
        speed = 200;
        CarName = "GV80";
        좌석수 = 4;
        연료탱크크기 = 45;
    }


    void onOff(boolean 부가기능) {
        if (부가기능) {
            좌석수 += 1;
        }
    }
}
