package datetime;

import java.time.LocalDate;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class MartOffDay {
    public static void main(String[] args) {//temporalAdjuster를 구현함.
        LocalDate today = LocalDate.of(2017,3,15);

        LocalDate nextMartOffDay = today.with(new TheDayMartOff());

        System.out.println(nextMartOffDay);
    }
}
