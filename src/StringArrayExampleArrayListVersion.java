/**
 * Created by Alix Gawon Lee on 2017-04-06.
 */

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class StringArrayExampleArrayListVersion {
    public static void main(String[]args){

        String[] strArr = {
                "숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지", "은행골", "메이비"
                , "돌배기집", "구로곱창", "두끼 구로디지털단지점", "아비꼬", "마루가메제면", "킹콩부대찌개 구로디지털점"
                , "바른식탁", "말뚝곱창", "보나베띠", "춘자싸롱", "황제해물보쌈", "호우 양꼬치"};

        /*List<String> goument = new ArrayList<>();
        goumet.add("숟가락반상 마실");
        goumet.add("스시메이진");
         */
        List<String> goumet = Arrays.asList(
                "숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지", "은행골", "메이비"
                , "돌배기집", "구로곱창", "두끼 구로디지털단지점", "아비꼬", "마루가메제면", "킹콩부대찌개 구로디지털점"
                , "바른식탁", "말뚝곱창", "보나베띠", "춘자싸롱", "황제해물보쌈", "호우 양꼬치"

        );
        List<String> goumetUnderThreeChar = new ArrayList<>();

        for (String e : goumet) {
            if (e.length() <= 3) {
                goumetUnderThreeChar.add(e);
            }
        }
// 새로 만들어진 리스트 출력
        for (String e : goumetUnderThreeChar) {
            System.out.println(e);
        }
    }
}
