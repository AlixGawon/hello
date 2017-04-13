package mapml;

import mapml.model.Park;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class ParkModel {
    public static void main(String[] args) {

        //List<Park> list = new ArrayList<>(); //list for park object

        Map<String, Park> map = new HashMap<>();//Map에는 항상 Key, Value를 순서대로 넣어야 함 Park에 있는 것을 불러오는 것


        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\Parks.csv"));//여기서 FileReader 할 때
            // 에러뜨면 좌측 빨간전구 누르고 try, catch구문 삽입

            br.readLine(); //skip the first line
            String line = "";
            while ((line = br.readLine()) != null) {

                String[] splitted = line.split(",");

                // Map에 넣기 list에서는 add를 쓰고 map에서는 put을 씀
                map.put(splitted[0], new Park(splitted[1],splitted[2],splitted[3],splitted[4],splitted[5]));

            }

//try 문 안에 모든 것 넣기!!!!!!
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }



        System.out.println(map.get("BAL03"));
    }
}
