package datetime;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class DayAfterTomarrow implements TemporalAdjuster{ //temporalAdjuster type으로 만듦. 그냥 사용하면 에러뜨니까 빨간 전구로 메서드 생성하기.
    @Override
    public Temporal adjustInto(Temporal temporal) {

        return temporal.plus(2, ChronoUnit.DAYS); //이틀을 더해서 리턴해줌.
    }

}
