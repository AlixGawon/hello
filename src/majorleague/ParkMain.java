package majorleague;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alix Gawon Lee on 2017-04-10.
 */
public class ParkMain {


    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("src\\parks.csv");//csv는 데이터가 굉장히 간결하기 떄문에 많이 쓰임 그러나 너무 2차원 적임.

        BufferedReader br = new BufferedReader(fr);

        List<Park> parkList = new ArrayList();//정보 저장할 장소 만들기 데이터를 로딩하려면 무조건 객체를 만들어야 함.

        String line = "";
        while ((line = br.readLine()) != null) {

            String[] splitted = line.split(",");
            //List<String> splitted = Arrays.asList(line.split(",")); 이것은 비효율적

            /*Park p11 = new Park(splitted[0], splitted[1], splitted[2], splitted[3], splitted[4], splitted[5]);
            parkList.add(p11);// 읽어온 곳이 Park임. 그리고 지금 park class에 맞게 쪼개고 Park.add()사용하는 것처럼 다 넣어짐.
            //그 전 Gourmet 과 Member 는 수동으로 데이터를 입력하였던 것이고 이것은 파일을 불러온 것이라 차이가 있음.이건 계속 변수가 생김 비효율적임
*/
            parkList.add(new Park(splitted[0], splitted[1], splitted[2], splitted[3], splitted[4], splitted[5])); //이게 효율적. 주소값이 들어가는 것
            System.out.println(line);//null이 아닐 때 까지 반복. 실무에서는 이렇게 직관적으로 많이 사용.

        }

        ParkService service = new ParkService();

        int notUsParkNumber = ParkService.choiceOfState(parkList);
        int haveAliasParkNumber = ParkService.choiceOfAlias(parkList);
        double avgOfParkNameNumber = ParkService.avgOfName(parkList);

        System.out.printf("US가 아닌 볼 파크 수는 %d개 입니다.\n", notUsParkNumber);
        System.out.printf("별명이 있는 볼 파크 수는 %d개 입니다.\n", haveAliasParkNumber);
        System.out.printf("볼파크 이름의 글자 평균은 %.1f 입니다.\n", avgOfParkNameNumber);

    }
}
