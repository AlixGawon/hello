/**
 * Created by Alix Gawon Lee on 2017-04-04.
 */

import java.util.Scanner;

public class PasswordFormation {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        System.out.println("영단어를 입력하세요!");

        String inputted = in.nextLine();

        String beingCapital = inputted.substring(0, 1).toUpperCase();
        //System.out.println(beingCapital);


        String sum = inputted.substring(1,7);


        int length = inputted.length();
        //System.out.println(length);



        System.out.println("$$" + beingCapital + sum + (length * length) + "##");
    }

}
