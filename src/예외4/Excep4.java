package 예외4;

import java.util.Scanner;

// Arithmeticexception
public class Excep4 {
    public static void main(String[] args) {
        int rst = 0;
       Scanner sc = new Scanner(System.in);
  while (true) {
            System.out.print("나눗셈입력 : ");
int a = sc.nextInt();
     int c = sc.nextInt();
     try {
    rst = a / c;
            } catch (ArithmeticException e) {
//       System.out.println("0으로 못나눔.try again");
//   continue;
     rst = -1;
  } finally {
       System.out.println("프로그램 정상 종료합니다.");
System.out.println(rst);
break;
            }
        }
    }
}
