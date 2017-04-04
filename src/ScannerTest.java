import java.util.Scanner;

/**
 * Created by Alix Gawon Lee on 2017-04-04.
 */
public class ScannerTest {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in); //변수 만듦

        System.out.println("글자를 입력하시고 enter를 누르세요");

        String inputted = in.nextLine();


        System.out.println("키보드로 입력한 글자는 : " + inputted);
    }
}
