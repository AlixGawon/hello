/**
 * Created by Alix Gawon Lee on 2017-04-05.
 */

import java.util.Scanner;

public class InterestCalculation {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        //Input
        System.out.println("원금을 숫자만 입력하세요!  ");
        int principal = in.nextInt();
        /*int principalInt = Integer.parseInt(principal);*/

        System.out.println("기간을 숫자만 입력하세요!  ");
        int period = in.nextInt();

        System.out.println("이율을 소숫점으로 숫자만 입력하세요!  ");
        double interest = in.nextDouble();

        //process
        //이자계산공식 : 이자 = 원금 * 이율(연이율/100) * (월/12)
        //기간 : 연

        double interestCalFormula = principal * (interest/100) * (period/12);

        //output

        System.out.println(period + "개월 후 당신은 " + (principal + interestCalFormula) + " 원을 받을 수 있습니다.");
        //System.out.printf("%d개월 후에 당신은 %f원을 받을 수 있습니다.",howManyMonth, total);


    }
}
