/**
 * Created by Alix Gawon Lee on 2017-04-06.
 */

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[]args) {

        String inform = "오늘의 2번째 포스팅역시 맛집!" +
                "주말에 남자친구랑 너무 맛있게 먹고온 구로 초밥뷔페를 추천해드리려고하는데요!!" +
                "구로 초밥뷔페집의 이름은 스시메이진이라는 곳이에요^^♥" ;

        //1. inform 스트링을 리스트로 변환
        // 공백을 기준으로 분리( 공백을 딜리미터로 분리)
        //1-1 스트링을 분해해서 스트링의 배열로 만든다.
        //String[] splitted = review.split("");
        List<String> myList = new ArrayList<String>(Arrays.asList(inform.split(" "))); //ArrayList는 초깃값 필요 없음 그리고 split은 무엇을 기준으로 나누는 메소드, asㅣist는 myList에 inform.split을 넣을 때
        for (String e : myList) {

            System.out.println(e);
        }
        System.out.println(myList);


        //2. 리스트를 순회해서 전체 단어의 글자수의 평균을 구한다.

        int myListAmount = 0;
        int sum = 0;
        int sumAverage = 0;
        List<String> newMyList = new ArrayList<String>(); //새로운 리스트 생성한것임
        for (String e : myList) {
            myListAmount = e.length();
            sum += myListAmount;
            //System.out.println(sum);
            //3. 단어가 5자 이하인 새로운 리스트를 생성한다.
            if (e.length() <=5){
                newMyList.add(e);
            }
        }
        sumAverage = sum / myListAmount;
        System.out.println(sumAverage);






    }
}
