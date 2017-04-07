package gourmet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alix Gawon Lee on 2017-04-07.
 */
public class GourmetReview {

    public static void main(String[]args){

        //맛집 객체를 5개 만든다 (컨트롤 d ,타입이 Gourmet)

        Gourmet spoon = new Gourmet();//차트를 만든 것 Gourmet에서 title, mainMenu, score만든 것 참조하여 만드는 것.
        //spoon.title = "숟가락 반상 마실";//다 spoon으로 바꿔줌
        spoon.setTitle("숟가락반상 마실"); //setter형식으로 바꿔줘야 함. private 처리 하였기 때문에 바로 쓸 수 없음 메서드 통해야 함.
        System.out.println("이 라인은 생성자 호출 바로 후에 실행 될 거예요");
        //spoon.mainMenu = "한정식, 떡갈비, 갈비찜";
        spoon.setMainMenu("한정식, 떡갈비, 갈비찜");
        //spoon.score = 111;
        spoon.setScore(111);

        Gourmet sushi = new Gourmet();// Gourmet()는 생성자.
        //sushi.title = "스시메이진";//다 sushi로 바꿔줌
        sushi.setTitle("스시메이진");
        //sushi.mainMenu = "스시, 스시뷔페";
        sushi.setMainMenu("스시,스시뷔페");
        //sushi.score = 70;
        sushi.setScore(70);

        Gourmet chan = new Gourmet();
        //chan.title = "맛찬들";
        chan.setTitle("맛찬들");
        //chan.mainMenu = "한정식, 떡갈비, 갈비찜";
        chan.setMainMenu("한정식, 떡갈비, 갈비찜");
        //chan.score = 49;
        chan.setScore(49);

        Gourmet choi = new Gourmet();
        //choi.title = "최우영스시";
        choi.setTitle("최우영스시");
        //choi.mainMenu = "한정식, 떡갈비, 갈비찜";
        choi.setMainMenu("한정식, 떡갈비, 갈비찜");
        //choi.score = 49;
        choi.setScore(49);

        Gourmet ranch = new Gourmet();
        //ranch.title = "철판목장";
        ranch.setTitle("철판목장");
        //ranch.mainMenu = "한정식, 떡갈비, 갈비찜";
        ranch.setMainMenu("한정식, 떡갈비, 갈비찜");
        //ranch.score = 46;
        ranch.setScore(46);

        Gourmet yongHo = new Gourmet("용호낙지", "낙새, 낙곱새", 46); //Gourmet에 파라미터가 세 개 있는 생성자를 만들면 됨.

        String s= new String("Hello");



        //맛집 객체를 리스트에다 담기. 알트 엔터하면 필요한 성분이 저절로 import됨

        List<Gourmet> list = new ArrayList<>();
        list.add(spoon);
        list.add(sushi);
        list.add(chan);
        list.add(choi);
        list.add(ranch);

        // 앞에 코딩이 너무 장황해 지니깐 syntax sugar!!!!
        // List<Gourmet> list = Arrays.asList({
                   // spoon,sushi,chan,choi,ranch
        //);

        //score들의 평균

        GourmetService zzz = new GourmetService();
        System.out.println(zzz.calcAverageScore(list)); //calcAverageScore가 list를 참조하였기 때문에 적는 것.



        //






    }
}
