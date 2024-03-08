package 인터페이스;
//강아지의 소리를 만들어줘야함
//강아지소리는 어디서갖고오나
//동물인터페이스에서 가져옴
//interface를 가져오기위해서는 implements를 사용해서 원하는 interface를 가지고온다

public class 강아지 implements 동물{
    public void 소리만들기() {
        System.out.println("강아지는 멍멍");
    }

    public void 밥먹기() {
        System.out.println("먹습니다");
    }
}
