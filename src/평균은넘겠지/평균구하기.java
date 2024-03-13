package 평균은넘겠지;

import java.util.Scanner;

public class 평균구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double[] result = new double[c];
        for (int i = 0; i < result.length; i++) {
            result[i] = overRate();
        }
        for (double val : result) {
            System.out.printf("%.3f%%\n", val);
        }
    }

    static double overRate() {
        int total = 0;
         int overc = 0; //평균이 넘는 사람의 수
        Scanner sc = new Scanner(System.in);
        int scnt = sc.nextInt();
        int[] score = new int[scnt];
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            total += score[i]; //총점누적
        }
        double average = (double) total / scnt; //명시적형변환,묵시적형변환이일어남
        for (int val : score) {
            if (val > average) overc++;//평균을넘는사람의수
        }
        return (double) overc / scnt * 100;
    }
}
