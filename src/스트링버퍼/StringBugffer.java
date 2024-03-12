package 스트링버퍼;

//String버퍼와 스트링빌더는 문자열을 추가하거나 변경할때사용
//동일한 기능을 하는 스트링을사용하면 좀더 간결하기는 함
//스트링과의차이는 문자열이 여러번 반복추가 되어서 한번만 생성
public class StringBugffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("wakwak");
        sb.delete(0,3);
        sb.insert(0,"jjj");
        System.out.println(sb);

    }
}
