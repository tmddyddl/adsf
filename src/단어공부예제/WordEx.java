package 단어공부예제;

import java.util.Scanner;

public class WordEx {
    public static void main(String[] args) {
        int[] Alphabet= new int[26]; //알파벳 개수만큼 배열생성
        int max = 0; //가장많이 등장하는 단어의수를 저장하는변수
        char result = 0; //가장많이등장한 단어를저장(출력)
        Scanner sc = new Scanner(System.in);
        System.out.println("단어입력");
        String word = sc.next(); // 스캐너로부터 단어를 입력받음
        for(int i = 0; i<word.length(); i++) {
            if(word.charAt(i) >= 'a') Alphabet[word.charAt(i)-'a']++; //해당하는 알파벳의 인덱스에 1증가
            else Alphabet[word.charAt(i)-'A']++;
        }
        for(int i = 0; i< Alphabet.length; i++) {
            if(Alphabet[i] == max) result = '?';//단어의 최대개수가 같다면?출력
            else if (Alphabet[i]>max) {
                max = Alphabet[i];
                result = (char) ('A'+i);

            }
        }System.out.println(result);
    }

}
