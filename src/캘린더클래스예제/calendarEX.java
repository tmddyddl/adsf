package 캘린더클래스예제;

import java.util.Calendar;

public class calendarEX {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR) + "년" + calendar.get((Calendar.MONTH) + 1) + "월" + calendar.get(Calendar.HOUR) + "시" + calendar.get(Calendar.MINUTE) + "분" + calendar.get(Calendar.SECOND) + "초");
    }
}
