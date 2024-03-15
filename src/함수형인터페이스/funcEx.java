package 함수형인터페이스;
//자바는 함수가 독립적으로만들어질수없으므로

interface calculator {
    int sum(int a, int b);
}

//class Mycal implements calculator {
//    @Override
//    public int sum(int a, int b) {
//        return a+b;
//    }
//}

public class funcEx {
    public static void main(String[] args) {
        calculator mc = (a, b) -> a+b;
        int result = mc.sum(100,200);
        System.out.println(result);

        }
    }
