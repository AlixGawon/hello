/**
 * Created by Alix Gawon Lee on 2017-04-05.
 */
public class ElementAverage {
    public static void main(String[]args){

        String[] iArr = {"숟가락반상마실","스시메이진","맛찬들","최우영스시","철판목장","용호낙지","은행골","메이비","돌배기집"};

        //배열은 무조건 for문 돌리기
        int sum = 0;
        int numOfChar = 0;
        int sumAverage = 0;
        int averageLength = iArr.length;
        //변수는 무조건 앞에 적는다!!!!!
        for (String e : iArr) {
            numOfChar = e.length();
            //System.out.println(numOfChar);
             sum = sum + numOfChar;
             //System.out.println(sum);
            //이래야 다 더해짐
        }

        sumAverage = sum / averageLength;

        System.out.println("글자수 평균" + sumAverage);


    }
}
