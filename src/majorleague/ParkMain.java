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

        FileReader fr = new FileReader("src\\parks.csv");

        BufferedReader br = new BufferedReader(fr);

        List<Park> list = new ArrayList();

        String line = "";
        while ((line = br.readLine()) != null) {

            String[] splitted = line.split(",");

            Park p11 = new Park(splitted[0], splitted[1], splitted[2], splitted[3], splitted[4], splitted[5]);
            list.add(p11);// 읽어온 곳이 Park임. 그리고 지금 park class에 맞게 쪼개고 Park.add()사용하는 것처럼 다 넣어짐.
            //그 전 Gourmet 과 Member 는 수동으로 데이터를 입력하였던 것이고 이것은 파일을 불러온 것이라 차이가 있음.

            System.out.println(line);//null이 아닐 때 까지 반복. 실무에서는 이렇게 직관적으로 많이 사용.
        }
    }
}
