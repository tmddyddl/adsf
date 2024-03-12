package 오브젝트클래스;

//오브젝트클래스는 모든 클래스의 조상클래스
public class Object {
    public static void main(String[] args) {
        Student student = new Student();
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}

class Student {
    int id;
    String name;
}

class Car {

}