package 인터페이스;

public class 컴퓨터 implements 이미지사이즈 {

    public void resize(int 가로,int 세로) {
        System.out.println("컴퓨터 가로크기: "+가로+",세로크기 :"+세로);
    }

    @Override
    public void buttonSize(int 가로, int 세로) {
        System.out.println("컴퓨터버튼의 가로크기:"+가로 + ",세로크기" + 세로);

    }
}
