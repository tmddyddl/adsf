package 상속응용1번;
//상속에서 final 사용
//final 키워드 : 수정불가상태로 만드는것
public class InheritanceEX2 {
    public static void main(String[] args) {

    }
}

class Car {
    int speed; //인스턴스 필드
    String color;
    String name;
    final void  accelerator() {
        System.out.println("차의 속도를 증가시킵니다");
    }
    final void breakPanel() {
        System.out.println("차의 속도를 감소시킵니다");
    }
}

class SportsCar extends  Car {
    boolean isTurbo;
    SportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        color = "Red";
    }
    int getSpeed() {
        if (isTurbo) return  speed *= 1.2;
        return speed;
    }
    boolean isTurbo() {
        return  isTurbo;
    }
    void infoCar() {
        System.out.println("이름:" +name);
        System.out.println("속도:" + getSpeed());
        System.out.println("색상:" + color);
        System.out.println("부스트"+ isTurbo);
    }
}




















