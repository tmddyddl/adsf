package 집합;

import java.util.Arrays;
import java.util.HashSet;

//집합은 중복값이 없음
//합집합 : 둘중한군데에 값이 존재하면 모두포함 중복의경우 한개의 값만포함
//교집합: 둘다 값이 존재해야 포함
//차집합: 앞데이터에서 뒤데이터 를빼고남은것
public class zip {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
   //     s1.addAll(s2); // 합집합을 수행
      //   s1.retainAll(s2);//교짖ㅂ합
       // s1.removeAll(s2);차집합
        System.out.println(s1);
    }


    }

