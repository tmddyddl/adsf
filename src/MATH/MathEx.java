package MATH;
//math클래스는 수학에서 자주사용하는 상수들과 함수들을 미리구현해놓은클래스
//math 클래스의 모든메소드는 클래스메소드이므로 객체생성을 하지않음
//java.lang기본패키지에포함되어있어 별도의 import가필용없음
public class MathEx {
    public static void main(String[] args) {
        //random():0.0이상1.0미만의 임의의 double형의 값을 생성해서 반환

            System.out.println((int)(Math.random()*45)+1);
            //abs():절대값

        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(-3.14));
        //ceil():소수점이하를 무조건 올림
        System.out.println(Math.ceil(10.000001));
        //floor():소수점이하 제거
        System.out.println(Math.floor(10.000001));
        //round():반올림
        System.out.println(Math.round(10.499999));
        System.out.println(Math.round(10.500000));
        //max():두개의 변수값중 큰값반환
        System.out.println(Math.max(100,200));
        System.out.println(Math.min(100,200));




    }
}
