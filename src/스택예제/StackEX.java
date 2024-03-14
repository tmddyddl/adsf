package 스택예제;

import java.util.Scanner;
import java.util.Stack;

//스택을이용한 괄호 열림닫힘확인
public class StackEX {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식입력: ");
        String exp = sc.next();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                st.push(ch); //열린괄호일땨push
            } else if (ch == ')') {
                if (!st.isEmpty()) st.pop();
                else {
                    System.out.println("괄호가일치하지않습니다.");
                    return;
                }
            }
        }
        if (st.isEmpty()) {
            System.out.println("일치합니다.");
        } else {
            System.out.println(" 불일치");
        }

    }
}
