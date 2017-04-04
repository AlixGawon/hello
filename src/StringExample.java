/**
 * Created by Alix Gawon Lee on 2017-04-04.
 */
public class StringExample {
    public static void main(String[]args){

        String myStr1 = "Bonjour, Alix! ";
        String myStr2 = "안녕, 알릭스!";

        String result1 = myStr1 + myStr2;
        // 이항연산자 숫자일때는 덧셈 연산, 문자열일때는 결합연산이 이루어짐

        String result2 = myStr1 +3;
        // 문자열 + 숫자일 경우에는 그냥 문자열과 숫자가 같이 출력됨. 즉 결합연산

        /*문자열 소문자로 변환하기*/

        String sliced = myStr1.toLowerCase();
        // toLowerCase 메서드는 모두 다 소문자로 바꿔줌

        /*boolean 이용해서 결과값 도출하기*/
        boolean b = myStr1.contains("our");

        /*지정한 글자로 시작여부에 따른 boolean 값 도출하기*/
        boolean c = myStr1.startsWith("bo");
        boolean d = myStr1.startsWith("Bo");


        /*결과값*/

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(sliced);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

}
