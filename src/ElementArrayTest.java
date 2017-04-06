/**
 * Created by Alix Gawon Lee on 2017-04-06.
 */
public class ElementArrayTest {
    public static void main(String []args) {

        String[] strArr = {
                "숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지", "은행골", "메이비"
                , "돌배기집", "구로곱창", "두끼 구로디지털단지점", "아비꼬", "마루가메제면", "킹콩부대찌개 구로디지털점"
                , "바른식탁", "말뚝곱창", "보나베띠", "춘자싸롱", "황제해물보쌈", "호우 양꼬치"};

        String newStrArr [] = new String[40]; // 반드시 배열 초기값 줘야함! 40으로 한 것은 일부러 큰 수를 넣은 것 교수님은 String[StrArr.length]하심

        int numberArr = strArr.length; // 총 업체 수

        int ArrLength = 0; // 간판 글자 수(띄어쓰기 포함)
        int hapOfStrArr = 0; // 전체 업체의 간판 글자 수를 더한 값
        int avgOfStrArr = 0; // 글자값의 평균
        int i = 0; //이미 배열이 돌고있기 때문에 새로운 배열을 시작하려면 0부터 시작해야하니깐!

        for (String e : strArr) {
            ArrLength = e.length(); // 각 업체의 글자 수 추출(String은 length 뒤에 ()붙음 함수 호출이기 때문 다른것은 안 붙음 변수 호출이라서)
            hapOfStrArr = hapOfStrArr + ArrLength; // 글자수 ++

            if(ArrLength <= 3){ // 3글자 이하 업체 추출
                newStrArr[i] = e; // 해당되는 업체는 newStrArr라는 배열로 삽입
                System.out.println(newStrArr[i]);

            }
            //System.out.println(rodlsArr);
        }

        avgOfStrArr = hapOfStrArr / numberArr; // 총 글자 수 평균

        System.out.println(avgOfStrArr);
    }

}
