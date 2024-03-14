package 학생성적순정렬하기;

import java.util.Scanner;
import java.util.TreeSet;

public class StudentEx {
    public static void main(String[] args) {
        TreeSet<Grade> list = new TreeSet<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("학생수 입력");
        int n= sc.nextInt();
      for(int i = 0; i< n; i++) {
          String name = sc.next();
          int score = sc.nextInt();
          list.add(new Grade(name, score));
      }
for(Grade e :list) System.out.println(e.name +" : "+ e.score);

    }
}
