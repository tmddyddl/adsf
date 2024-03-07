package 중복값;
//1~45사이의 중복되지않은 6개의 정수
public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6]; //로또번호를 담기윈한 배열
        int number =0; //랜덤으로생선된 로또번호를 담을 변수
        int index = 0; // 로또번호를 담고 배열의 위치를 이동하기위해 사용
        boolean isExist = false; // 중복겨부를 체크
        while(true) { //중복이 몇번발생할지 모르기때문메 무한 반복
            number = (int)(Math.random()*45+1); // 1~45사이의 정수 값을 반환
            for (int i =0; i<6; i++) {
                if (lotto[i] == number) isExist= true; //배열내에서 랜덤으로 생성한 번호와 같은게 있으면 true를 반환
            }
            if (!isExist)
                lotto[index++] = number; //중복되지 않으 번호를 배열에 넣고 인덱스를 중가
            if (index == 6 ) break; //중복되지 않은 로또 번호가 6개 만들어졌으므로 반복문 탈출
            isExist = false;
        }
        for (int i = 0; i<6; i++) {
            System.out.print(lotto[i]+" ");
        }
        System.out.println();
    }
}


