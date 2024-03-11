package 조별과제;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int 지역 = sc.nextInt();
        System.out.println("이동할 승객 수 입력 : ");
        int 승객수 = sc.nextInt();
        System.out.println("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int 차량 = sc.nextInt();
        System.out.println("부가 기능 [1]ON [2]OFF : ");
        boolean 부가기능;
        if (sc.nextInt() == 1) 부가기능 = true;
        else 부가기능 = false;
        System.out.println();

        Bus bus = new Bus();
        SportsCar sportsCar = new SportsCar();
        Car car = new Car();
        switch (지역) {
            case 1:
                System.out.println("부산");
                지역 = 400;
                break;
            case 2:
                System.out.println("대전");
                지역 = 150;
                break;
            case 3:
                System.out.println("강릉");
                지역 = 200;
                break;
            case 4:
                System.out.println("광주");
                지역 = 300;
                break;
        }
        switch (차량) {
            case 1:

                sportsCar.Carname();
                sportsCar.onOff(부가기능);
                sportsCar.이동시간(지역, 승객수);
                sportsCar.비용계산(지역);
                sportsCar.주유횟수(지역);
                break;
            case 2:
                car.Carname();
                car.onOff(부가기능);
                car.이동시간(지역, 승객수);
                car.비용계산(지역);
                car.주유횟수(지역);
                break;
            case 3:
                bus.Carname();
                bus.onOff(부가기능);
                bus.이동시간(지역, 승객수);
                bus.비용계산(지역);
                bus.주유횟수(지역);
                break;
        }


    }
}
