package 토큰스플릿;

import java.util.Scanner;
import java.util.StringTokenizer;

//stringrokenizer:문자열이 특정구분자로 연결되어있는경우, 구분자 기준으로 잘라서 새로운 문자열 생성
public class Token {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력 : ");
      String names = sc.nextLine();
  //      StringTokenizer st = new StringTokenizer(names, "/");
 //       String[] nameStr = new String[st.countTokens()]; //남아있는토큰수
 //       int idx = 0;
//            nameStr[idx++] = st.nextToken(); //토큰을하나씩꺼내옴
   //     }
        String[] nameStr = names.split("/");
        for(String e : nameStr) System.out.print(e + " ");

    }
}
