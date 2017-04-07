/**
 * Created by Alix Gawon Lee on 2017-04-04.
 */

import java.util.Scanner;

public class PasswordFormation {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        System.out.println("영단어를 입력하세요!");

        String inputted = in.nextLine();

        String beingCapital =""; //String 초깃값은 ""

        String sum = "";





        int length = inputted.length();
        //System.out.println(length);

        String passwordGenerated = makePassword(inputted,beingCapital, sum);//변수 다 적어줘야 함



        System.out.println("$$" + passwordGenerated + (length * length) + "##");
    }
    public static String makePassword(String inputted, String beingCapital, String sum) { //필요한 것 다 적기기
        beingCapital = inputted.substring(0, 1).toUpperCase();
        //System.out.println(beingCapital);

        sum = inputted.substring(1);
        //String sum = inputted.substring(1,7);
        // 여기서 잘못 만들음. 끝이 어딘 줄 알고 7까지 지정함

        return beingCapital;
    }

}

/* <강사님 모범답안>

   Scanner in = new Scanner(System.in);

   System.out.println("단어를 입력하세요!");

   String inputted = in.nextLine();

   String prefix = "$$";
   String postfix = "##";
   int squareLengthOfChar =
         targetStr.length() * targetStr.length();

         targetStr =
             targetStr.substring(0,1).toUpperCase()
             + targetStr.substring(1);//substring(1)은 두 번째부터 끝까지임.

             string passwordTranslated =
                  prefix + targetStr + squareLengthOfChar + postfix;

             System.out.println(result);

*/
