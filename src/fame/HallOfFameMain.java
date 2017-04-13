package fame;

import fame.model.HallOfFame;//패키지 안에 패키지가 있어서!

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class HallOfFameMain {

    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new FileReader("src\\HallOfFame.csv"));//파일 불러오고 그 파일 보기 좋게 정리
        br.readLine(); //첫 번째 라인 스킵. 안 그러면 String하고 int값 준 것이 혼선 올 수 있음.
        List<HallOfFame> hallOfFameList = new ArrayList<>();//정보 저장할 장소 만들기 데이터를 로딩하려면 무조건 객체를 만들어야 함.

        String line = "";
        boolean inductedgab = false;
        int a = 0;
        int b = 0;
        int c = 0;

        while((line = br.readLine()) != null) {

            String[] splitted = line.split(",");//String[]의 객체를 splitted로 생성한 후, 단위로 나누겠다.

//            HallOfFame fame = new HallOfFame();
//            fame.setPlayerId(splitted[0]);
            if (splitted[3].equals("")) { //혹시 데이터 칸이 비어있으면
                a = 0;//0을 넣도록 설정
            } else {
                a = Integer.parseInt(splitted[3]);
            }

            if (splitted[4].equals("")) {
                b = 0;
            } else {
                b = Integer.parseInt(splitted[4]);
            }


            //splitted[4].equals("") ? fame.setNeeded(0) : Integer.parseInt(splitted[4]);라고 조건 연산자 써도 됨.

            if (splitted[5].equals("")) {
                c = 0;
            } else {
                c = Integer.parseInt(splitted[5]);
            }

            hallOfFameList.add(new HallOfFame(splitted[0], Integer.parseInt(splitted[1]), splitted[2],
                    a, b, c, inductedgab, splitted[7]));
        }

            }

            //이렇게 해줘야 중간에 파일 상에 있는 공백으로 인한 에러를 없앨 수 있음.

            /*hallOfFameList.add(new HallOfFame(splitted[0], Integer.parseInt(splitted[1]), splitted[2]
                    , Integer.parseInt(splitted[3]),
                    Integer.parseInt(splitted[4]), Integer.parseInt(splitted[5]), (splitted[6])
                    , splitted[7]));//생성자 만들어야지 가능, String을 int로 바꿔주는 Integer.parseInt 기억하기!
            //이게 효율적. 주소값이 들어가는 것
            //System.out.println(line);//null이 아닐 때 까지 반복. 실무에서는 이렇게 직관적으로 많이 사용. */



        //2. mapping
        //HallOfFame -->PlayerAverage
//        List<PlayerAverage> newList = new ArrayList<>();
//                for (HallOfFame e : hallOfFameList) {
//                    PlayerAverage p = new PlayerAverage();
//                    p.setPlayerId(e.getPlayerId());
//                    p.setAverage((e.getBallots() + e.getNeeded() + e.getVotes()) / 3);
//
//                    newList.add(p);
//                }
//        //현재 데이터를 분석해서 결론을 도출
//
//        HallOfFameService service = new HallOfFameService();

    }
