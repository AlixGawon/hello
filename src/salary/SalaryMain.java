package salary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class SalaryMain {
    public static void main(String[] args) throws Exception {

        /*FileReader fr = new FileReader("src\\Salaries.csv");
        BufferedReader br = new BufferedReader(fr);//fileReader객체를 한 번 덮어서 언급하는..decorating하는 것이라고 생각.*/

        BufferedReader br = new BufferedReader(new FileReader("src\\Salaries.csv"));//한 번에! 관용적인 표현이므로 외우기.
        br.readLine(); //첫 번째 라인 스킵
        List<Salary> salaryList = new ArrayList<>();//정보 저장할 장소 만들기 데이터를 로딩하려면 무조건 객체를 만들어야 함.

        String line = "";

        while((line = br.readLine()) != null) {

            String[] splitted = line.split(",");//String[]의 객체를 splitted로 생성한 후, 단위로 나누겠다.


            salaryList.add(new Salary(splitted[0], splitted[1], splitted[2], splitted[3],
                    Integer.parseInt(splitted[4])));//생성자 만들어야지 가능, String을 int로 바꿔주는 Integer.parseInt 기억하기!
            //이게 효율적. 주소값이 들어가는 것
            //System.out.println(line);//null이 아닐 때 까지 반복. 실무에서는 이렇게 직관적으로 많이 사용.

        }

        //현재 데이터를 분석해서 결론을 도출

        SalaryService service = new SalaryService();


        //Salary salary = service.getHighestSalaryPlayer(salaryList);
        Salary salary = SalaryService.getHighestSalaryPlayer(salaryList);//static을 잘 활용할 것.이것을 쓰면 활용 가능

        System.out.printf("%s의 연봉은 %d불 입니다.\n", salary.getPlayerID(),salary.getSalary());
        System.out.println(salary.toString());//toString함수 호출
    }
}
