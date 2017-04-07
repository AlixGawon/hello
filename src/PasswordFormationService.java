/**
 * Created by Alix Gawon Lee on 2017-04-07.
 */


public class PasswordFormationService {

    public static String makePassword(String inputted, String beingCapital, String sum) { //필요한 것 다 적기기
        beingCapital = inputted.substring(0, 1).toUpperCase();
        //System.out.println(beingCapital);

        sum = inputted.substring(1);
        //String sum = inputted.substring(1,7);
        // 여기서 잘못 만들음. 끝이 어딘 줄 알고 7까지 지정함

        return beingCapital;
    }
}
