package salary;

import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class SalaryService {
    //최고연봉 받는 사람 객체 받아서 출력

   public static Salary getHighestSalaryPlayer(List<Salary> salaryList) {//객체로 받아야하니까 Salary값으로 받아야 함.salaryList로 지정해야지 헷갈리지 않음.
       Salary highestSalaryPlayer = new Salary();
       for (Salary e : salaryList) {

           if(e.getSalary() > highestSalaryPlayer.getSalary()) {
               highestSalaryPlayer = e;//도전자가 챔피언보다 연봉이 높으면 갈아치우는 것이다. 그렇게 65000번을 계속함. reducing이다.
           }


       }
       return highestSalaryPlayer;
   }

   public static Salary getLowestSalaryPlayer(List<Salary> salaryList) {
       return null;
   }

   public static double getAllPlayersAverageSalary(List<Salary> salaryList) {
       return 0.0;
   }
}
