package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class HelloDate {

    public static void main(String[] args) {
        //현재 날짜 구하기
        long current = System.currentTimeMillis();//1970년대 그때로부터 시간!
        System.out.println(current);

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        LocalDate date1 = LocalDate.of(2017,4,18);

        //날짜연산

        LocalDate today = LocalDate.now();//dhsmf
        LocalDate tomarrow = today.plus(1, ChronoUnit.DAYS); //오늘에 1일을 더한다.



    }
}
