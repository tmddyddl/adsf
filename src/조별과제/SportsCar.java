package 조별과제;

public class SportsCar extends vehicle {
    public SportsCar() {
        연비 = 8;
        speed = 250;
        CarName = "페라리";
        좌석수 = 2;
        연료탱크크기 = 30;
    }

    void onOff(boolean 부가기능) {
        if (부가기능) {
            speed *= 1.2;
            System.out.println("스피드" + speed);
        }
    }
}
