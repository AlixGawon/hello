package majorleague;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ParkService {
    //국가가 US가 아닌 볼 파크 수?

        public static int choiceOfState(List<Park> MemberList) { // us가 아닌 국가 수 세는거
            int sum = 0;

            for (Park List : MemberList){
                if(List.getCountry().equals("US")){
                    sum += 0;
                    System.out.println(" "+ List.getCountry() + ","+ sum);
                }else sum += 1;
            }
            return sum;
        }
        //별명이 있는 볼 파크 수

        public static int choiceOfAlias (List<Park> MemberList) { // 별명이 있는 볼 파크 수
            int sum = 0;

            for (Park List : MemberList){
                if(List.getAlias().equals("")){
                    sum += 0;
                    //System.out.printf(List.getParkAlias());
                }else sum +=1;
            }
            return sum;
        }
        //볼파크 이름의 글자 평균

        public static double avgOfName (List<Park> MemberList) { // 볼 파크 이름의 글자 평균
            int sum = 0;

            for (Park List : MemberList){
                sum = sum + List.getName().length();
            }
            return sum / MemberList.size();
        }

    }

