package majorleague;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class FileReaderExample {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("src\\parks.csv");

        BufferedReader br = new BufferedReader(fr);



       /* while(true) {//무한반복
            String line = br.readLine();

            if (line == null) { //line이 null이 되면 반복문을 빠져나가도록 조건문 생성
                break;
            }
            System.out.println(line);
        }
*/
        String line = "";
        while ((line = br.readLine()) != null) {//null이 아닐 때 까지 반복. 실무에서는 이렇게 직관적으로 많이 사용.


        }
    }
}
