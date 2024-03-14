package 단어정렬예제;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

// 컬렉션 프레임워크는 검색기능을 강화시킨 treeset과 treemap제공
public class Word {
    public static void main(String[] args) {

        //사용자로부터n개의 수를 입력받음
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //n개의 문자열을 입력받은배열 생성 문자여릉ㄹ 줄바꿈기준으로입력받음
        String[] word = new String[n];
        sc.nextLine();//입력받은줄바꿈문자를소모시킴
        for (int i = 0; i < word.length; i++) {
            word[i] = sc.nextLine();//줄바꿈기준으로 입력받아서배열에담음
        }
        //중복제거
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word));
        word = hashSet.toArray((new String[0])); //set의 깇이를 유지하면서 배열로변환
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);//앞의값이 사전순으로 뒤에있는경우 양수반환
                } else {
                    return o1.length() - o2.length();
                }

            }
        });
        System.out.println(Arrays.toString(word));
    }
}
