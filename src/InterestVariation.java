/**
 * Created by Alix Gawon Lee on 2017-04-05.
 */

import java.util.Scanner;

public class InterestVariation {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        System.out.print("원금을 입력하세요 : ");
        int principal = in.nextInt();

        System.out.print("이율을 입력하세요 : ");
        double interestRate = in.nextDouble();

        System.out.print("기간을 입력하세요 : ");
        int period = in.nextInt();

        if (period >= 36) {
            interestRate = interestRate * 0.7;
        }

        double interest = principal * (interestRate * 0.01) * (period/12);


        System.out.printf("%d개월 후에 당신은 %f원을 받을 수 있습니다.", period, interest );

    }
}
