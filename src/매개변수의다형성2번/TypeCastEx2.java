package 매개변수의다형성2번;

import java.util.Scanner;

public class TypeCastEx2 {
    public static void main(String[] args) {
        Driver driver = new Driver("장원영");
        Bus bus =new Bus();
        Taxi taxi =new Taxi();
        SportsCar sportsCar = new SportsCar();
        Scanner sc =new Scanner(System.in);
        System.out.print("운전하고 싶은 차 선택 : 1.버스, 2.택시, 3.스포츠카:");
        int selMenu = sc.nextInt();
        switch (selMenu) {
            case 1 : driver.drive(bus); break;
            case 2 : driver.drive(taxi); break;
            case 3 :driver.drive(sportsCar); break;
            default: System.out.println("선택한 차량이 없습니다.");

        }
    }
}
class Driver {
    String name;
    public Driver(String name) {
        this.name = name;

    }
    public void drive(Vehicle vehicle) {
        System.out.println(name +"의");
        vehicle.run();


    }
}
class Vehicle {
    public void run() {
        System.out.println("차가 달린다");
    }
}

class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달린다");
    }

}
class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달린다");
    }
}

class SportsCar extends Vehicle {
    @Override
    public void run() {
        System.out.println("스포차카가 달린다");
    }
}