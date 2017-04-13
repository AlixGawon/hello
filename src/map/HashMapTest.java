package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class HashMapTest {

    public static void main(String[]args) {

        //List는 index를 기반으로 하는 것의 사례

        Map<String, String> map = new HashMap<>();//Map에는 항상 Key, Value를 순서대로 넣어야 함
        map.put("1", "Kim-map");
        map.put("2", "Lee-map");
        map.put("3", "Park-map");

        System.out.println(map.get("2"));

        List<String> list = new ArrayList<>();
        list.add("Kim");
        list.add("Lee");
        list.add("Park");

        System.out.println(list.get(1)); //Lee 출력 됨 get()은 List에서 불러올 수 있게 하는 메서드.

        list.add(2, "Choi");//Lee와 Park의 사이에 Choi를 넣음.

        System.out.println(list.get(2));//Choi가 나옴
        System.out.println(list.get(3));//Choi한테 밀려서 Park가 나옴.
    }
}
