/**
 * Created by Alix Gawon Lee on 2017-04-04.
 */
public class StringArrangementTest {
    public static void main(String[]args){

        String teachersname = "SoonGon";

        System.out.println(teachersname);

        String sliced = teachersname.substring(1,7);

        System.out.println(sliced + 's');

        System.out.println(sliced + "say");

        /*substring을 두 번 사용하는 방법*/

        //s를 substring을 이용하여 잘라낸 후 다시 또 substring을 이용한다

        /*
        String original = "soongon"
        String firstChar = original.substring(0,1);
        String SecondChar = Original.substring(1,7);

        System.out.println("SecondChar + firstChar + "ay"
        */
    }

}
