package 학생성적순정렬하기;

public class Grade implements Comparable<Grade> {
    String name;
    int score;

    public Grade(String name, int grade) {
        this.name = name;
        this.score = grade;
    }
  public int compareTo(Grade o) {
      if(this.score < o.score) return 1;
      else if (this.score == o.score) {
          return name.compareTo(o.name);
      }else return -1;
  }
}
