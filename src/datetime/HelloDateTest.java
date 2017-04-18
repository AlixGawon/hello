package datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class HelloDateTest {
    public static void main(String[] args) {

        //그 때 날짜 먼저 구하고 날짜 더하기!

        LocalDate date = LocalDate.of(2017,4,3);//그 때 날짜(숫자 0으로 시작하면 8진수로 인식)

        LocalDate date50 = date.plus(49, ChronoUnit.DAYS);
        //LocalDate date50 = Date.plusDays(49); 개인적으로 이게 더 쉬움!!!!!!!!
        System.out.println(date50);

        LocalDate date100 = date.plus(99,ChronoUnit.DAYS);
        System.out.println(date100);

        LocalDate date200 = date.plus(199,ChronoUnit.DAYS);
        System.out.println(date200);

        LocalDate date500 = date.plus(499,ChronoUnit.DAYS);
        System.out.println(date500);

        LocalDate date1000 = date.plus(999,ChronoUnit.DAYS);
        System.out.println(date1000);

        //시간을 비교하는 코드 1

        if (date50.compareTo(date100) > 0) {
            System.out.println("date50이 더 커요");
        } else {
            System.out.println("date100이 더 커요");
        }

        //시간을 비교하는 코드 2

        if (date50.isAfter(date100)) {
            System.out.println("date50이 더 미래입니다");
        } else {
            System.out.println("date100이 더 미래입니다");
        }

        //date 날 부터 EpochDay날 까지 일수

        long l = date.toEpochDay();
        System.out.println(l);

        //50일 뒤의 3년 전의 석달 후

        LocalDate bb = date.plusDays(49).minusYears(3).plusMonths(3);
        System.out.println(bb);


    }
}
