package datetime;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class IntervalCheck {
    public static void main(String[] args) {

        Instant start = Instant.now(); // 시작 한 시간
        someAlgorithm();
        Instant end = Instant.now(); //끝난 시간

        //시간 차 구하기

        Duration duration = Duration.between(start, end); //period는 날짜인데 그것도 똑같이 between 씀
        long millis = duration.toMillis();
        System.out.println(millis);

        //박근혜 탄핵 이후 오늘이 몇 일 째인지 구하기 Period period = Period.between(ip,now);

//    LocalDate impeach = LocalDate.of(2017,3,10);
//    Instant impeach1 = Instant.from(impeach);
//    Instant now = Instant.now();

        LocalDate impeach = LocalDate.of(2017,3,10);
        LocalDate now = LocalDate.of(2017,4,18);

        Period period = Period.between(impeach,now);//과거와 현재 순서대로 적어야 -결과 나오지 않음
        int days = period.getDays();
        int month = period.getMonths();
        System.out.printf("%d개월 %d일", month, days);

        //TemporalAdjusters 이용하기

        //다음 월요일이 언제인지 계산

        LocalDate nextWed = now.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));//오늘로부터 다음 수요일(다음 주 아님)이 언제인지 계산.

        LocalDate theDay = now.with(new DayAfterTomarrow());
        System.out.println(theDay);

        System.out.println(nextWed);

        System.out.printf("%d개월 %d일",month,days);



    }



    public static void someAlgorithm(){

        long acc = 0L;
        for (int i = 0 ; i < 1000000000; i++) {
            acc +=i;
        }
    }
}
