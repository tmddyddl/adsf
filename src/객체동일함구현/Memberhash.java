package 객체동일함구현;

import java.util.HashSet;

// 기본적으로 객체(인스턴스)주소가 같으면 같은객체
public class Memberhash {
    public static void main(String[] args) {

        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001,"유나");
        Member member2 = new Member(1003,"채원");
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(new Member(1003,"카리나"));

        for (Member e : hashSet) e.showmember();

    }
}
class Member {
    int id;
    String name;
    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member= (Member) obj;
            if(this.id == member.id) return true;
            else return false;
        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showmember() {
        System.out.println("아이디: "+ id);
        System.out.println("name:" +name);
    }
}