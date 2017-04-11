package inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class inheritanceTest {

    public static void main(String[]args){
        //nothing


        Parent p = new Child(); //Child is a Parent.(가능) is a 관계가 성립되면 할당됨.
        //Child c1 = new Parent(); 이 것은 성립되지 않음

        p.smoke();//타입은 아버지지만 실제로 메모리에 있는건 아들

        List<String> a = new ArrayList<>(); //이것도 비슷한 사례

    }
}
