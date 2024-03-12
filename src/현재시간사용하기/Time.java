package 현재시간사용하기;
//currentTimeMillis(): 1970년 1월 1일 00:00:00.000을 기준으로 현재시간의 차이를 반환
//성능측정등에사용할수있음

import static java.lang.Thread.sleep;

public class Time {
    public static void main(String[] args) throws InterruptedException {
        int[] data= new int[1000];
        int cnt = 0;
        //배열내에서찾고자하는임의의수
        int randVal = (int)((Math.random()*1000)+1);
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        long start = System.currentTimeMillis(); //성능측정을시작하는시간
        for (int i =0; i<data.length; i++){
            cnt++;
            sleep(1);
            if(randVal == data[i]) {
                System.out.println("위치:"+(i+1));
                break;
            }
        }
long end=System.currentTimeMillis(); //성능측정종료시간
        System.out.println("검색에 소요된 시간:" +(end - start)+ "밀리초입니다");
    }

}
