package 박싱언박싱;

//Wrapper클래스: 기본타입을 객체타입으로 취급해야하는경우 사용
public class Boxingex {
    public static void main(String[] args) {
        Integer num = new Integer(17);
        int n = num.intValue();

        Integer num1 = 0;//오토박싱
        int n1 = num1; //오토언박싱


    }
}
