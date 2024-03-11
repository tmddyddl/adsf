package 접근제한자;

//접근제한자: 객체지향의 주요특성중에하나, 주로 내부 필득닶에대한 접근 여부를 제한 할 때 사용
//Private(동일 클래스내부에서만 접근 가능)
//default: 접근 제한자를 붙이지 않으면 default, 동일한 패키지 내에서 접근 허용
//protected : 동일한 패키지 내부이거나, 다른 패키지에 있더라도 상속관계가 있으면 접근 가능
//public : 접근제한을 하지 않음
public class RestrictorEx extends City {
    public static void main(String[] args) {
        Resrict resrict = new Resrict();
        resrict.seoul();
        resrict.busan();
        resrict.inchun();
        //대구private는 동일클래스내에서만 가능

    }
}
