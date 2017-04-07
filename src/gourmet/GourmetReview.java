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

        GourmetService zzz = new GourmetService();
        System.out.println(zzz.calcAverageScore(list)); //calcAverageScore가 list를 참조하였기 때문에 적는 것.



        //






    }
}
