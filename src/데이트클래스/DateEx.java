package 데이트클래스;
//데이트클래스는 운영체제로부터 시간을 읽어오는 클래스 반드시 객체를 새ㅓㅇ해서 사용

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        //원하는포멧으로 시간을출력하기위해서Simpledateformet사용
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");//년월일
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년M월d일");
        f4 = new SimpleDateFormat("HH:mm:ss");//HH24시간제
        f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째날입니다");
        f7 = new SimpleDateFormat("오늘은 yyyy년 w주차 입니다");
        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));

        //Calendar클래스:date클래스이 단점을 보완하기위해서 만듦
        //Calendar는 추상클래스로특정국가나 문화의 달력시스템에 맞게 하위클래스에서 구현
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1); //배열의 인덱스 가지고옴
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.AM_PM));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));



    }
}
