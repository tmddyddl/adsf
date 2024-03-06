package 상속;
//상속이란: 자식클래스가 부모클래스의 기능을 물려받는것(필드, 메소드)
//자식클래스는 부모클래스를 상속받으면 부모클래스의 크기와 같거나 크다
//상속을 받아서 그대로 사용하면 상속개념이 적용되고, 기능을 개석하거나 개롭게만들면 다형성(오버라이딩)이됨.
public class Inheritance {
    public static void main(String[]args) {
        HouseDog houseDog = new HouseDog();// Dog를 클래스의 기본생성자로 객체생성
        houseDog.setName("댕댕이");
        System.out.println("asdf");
    }
}

class Animal {
    String name; // 인스턴스 필드
    void setName(String name) {
        this.name = name;
    }
}
//Animal을 상속받아 Dog만들기
class Dog extends Animal {
    void sleep() {
        System.out.println(name + "zzz");

    }

}
class  HouseDog extends  Dog {
    @Override
    void sleep() {
        System.out.println(name+"zzz in house");
    }
    void sleep(int time) {
        System.out.println(name + "zzz in for"+ time+"times");
    }
}
