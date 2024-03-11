package 저항예제;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.black 2.brown 3.red 4.orange 5.yellow");
        System.out.println("6.green 7.blue 8.violet 9.gray 10.white");
        int[] color = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] mul = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        int first = 0, second = 0, third = 0;
        int fcolor = sc.nextInt();
        int scolor = sc.nextInt();
        int tcolor = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (fcolor == color[i]) first = i;
            if (scolor == color[i]) second = i;
            if (tcolor == color[i]) third = mul[i];
        }
        System.out.println((long)((first * 10) + second) * third);
    }
}