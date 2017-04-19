package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class DateTimeFormattingDemo {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        System.out.println(today +" "+ now);

        LocalDateTime todayAndNow = LocalDateTime.now();//날짜와 시간 다 지정 가능.

        //formatter 써보기 (DateTimeFormatter : 시간과 날짜 모두 포멧팅해줌) 2017.04.19 14:50

        String formatted =
                DateTimeFormatter.ofPattern("yyyy.MM.dd. HH:mm").format(todayAndNow);//ofPattern은 패턴 지정해주는 것 소문자 mm은 없음.
        System.out.println(formatted);
    }
}
