package 싱글톤;

public class Test {
    Singleton singleton = Singleton.getSingleton(); //객체를 생성하지않고 만들어져있는 싱글톤 참조
    void setInfo(String name, int id) {
        singleton.name = name;
        singleton.id = id;

    }
    void viewInfo() {
        System.out.println("이름: " + singleton.name);
        System.out.println("아이디:"+ singleton.id);
    }
}
