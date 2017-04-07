package gourmet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alix Gawon Lee on 2017-04-07.
 */
public class GourmetReview {

    public static void main(String[]args){

        //맛집 객체를 5개 만든다 (컨트롤 d ,타입이 Gourmet)

        Gourmet spoon = new Gourmet();
        spoon.title = "숟가락 반상 마실";//다 spoon으로 바꿔줌
        spoon.mainMenu = "한정식, 떡갈비, 갈비찜";
        spoon.score = 111;

        Gourmet sushi = new Gourmet();
        sushi.title = "스시메이진";//다 sushi로 바꿔줌
        sushi.mainMenu = "스시, 스시뷔페";
        sushi.score = 70;

        Gourmet chan = new Gourmet();
        chan.title = "맛찬들";
        chan.mainMenu = "한정식, 떡갈비, 갈비찜";
        chan.score = 49;

        Gourmet choi = new Gourmet();
        choi.title = "숟가락 반상 마실";
        choi.mainMenu = "한정식, 떡갈비, 갈비찜";
        choi.score = 49;

        Gourmet ranch = new Gourmet();
        ranch.title = "철판목장";
        ranch.mainMenu = "한정식, 떡갈비, 갈비찜";
        ranch.score = 46;



        //맛집 객체를 리스트에다 담기. 알트 엔터하면 필요한 성분이 저절로 import됨

        List<Gourmet> list = new ArrayList<>();
        list.add(spoon);
        list.add(sushi);
        list.add(chan);
        list.add(choi);
        list.add(ranch);

        //score들의 평균

        int listLength = list.size();
        int listLengthSum = 0;
        int listLengthAverage =0;

        for (Gourmet e : list) { //이것은 String 형태가 아니라 Gourmet 형식이다
            listLengthSum += e.score; //앞에 Gourmet class에 넣어야하니까( 앞에 int score준 것 생각하기!)

            System.out.println(listLengthSum);
        }
        listLengthAverage = listLengthSum / listLength;
        System.out.println(listLengthAverage);

        //






    }
}
