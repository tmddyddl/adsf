package 소수단어;

import java.util.Scanner;

public class 소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean isPrime = true; //기본값을 소수로 정의
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a') sum += word.charAt(i) - 'a' + 1;
            else sum += word.charAt(i) - 'A' + 27;
        }
        System.out.println(sum);
        for (int i = 2; i < sum; i++) {//1과자기자신을 제외하고 반목문순회
            if (sum % i == 0) isPrime = false;
        }
        if (isPrime) System.out.println("소수다");
        else System.out.println("소수아님");
    }
}