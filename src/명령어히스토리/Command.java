package 명령어히스토리;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Command {
    Queue<String> queue = new LinkedList<>();
    final static int Max = 10;

    public static void main(String[] args) {
        Command history = new Command();
        System.out.println("help를 입력하면 도움말을 볼수있음");
        while (true) {
            System.out.print("$ ");
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine().trim(); //문자열앞뒤공백날리기
            if (cmd.equalsIgnoreCase("q")) { //대소문자 구분안함
                System.exit(0); //프로그램강제종료
            } else if (cmd.equalsIgnoreCase("help")) {
                System.out.println("help - 도움말을 보여줍니다");
                System.out.println("q/Q - 프로그램종료");
                System.out.println("history - 최근입력한명령어" + Max + "개 보여줌");
            } else if (cmd.equalsIgnoreCase("history")) {
                history.save(cmd);
                int cnt = 0;
                for (String e : history.queue) {
                    cnt++; //명령히스토리앞에 숫자를 붙여주기위해서값증가시킴
                    System.out.println(cnt+" " +e);
                }
            }else {
                history.save(cmd);
                System.out.println(cmd);
            }
        }
    }
    void save(String cmd) {
        queue.offer(cmd); // 주어진객체삽입
        if(queue.size() > Max) queue.remove(); //주어진사이즈보다크면맨먼저삽입된값제거
    }
}
