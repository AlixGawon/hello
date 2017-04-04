/**
 * Created by Alix Gawon Lee on 2017-04-04.
 */
public class VarTypeExample {
    public static void main (String[]args) {

        //integer type
        int myInt = -2_000_000_000;
        //int myInt;는 변수의 선언, 메모리 공간을 확보하는 행위
        //myInt = 3;은 최초로 변수에 값을 담는 행위, 초기화
        //myInt = 9;는 재할당, re-assignment
        //왼쪽항과 오른쪽항의 자료형이 같아야 오류가 나지 않는다.

        long myLong = 9000_000_000_000_000_000L;
        //myLong = 1;은 허용 왜냐하면 int의 사이즈는 36비트 long의 사이즈는 64비트라 데이터 손실이 없다
        //myInt = 1.0;은 불허 왜냐하면 long의 사이즈가 int의 사이즈보다 커서 데이터 손실 발생

        //float type
        double myDouble = 3.14;

        //String type
        String myStr = "Hello world!";
        //String타입은 무조건 String타입에 담아야 오류 나지 않음

        char myChar = 'a';//내부적으로는 아스키코드로 저장됨

        //boolean type
        boolean myBool = true; //false
        //bool타입은 무조건 bool타입에 담아야 한다




    }
}
