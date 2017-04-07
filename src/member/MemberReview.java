package member;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 * Created by Alix Gawon Lee on 2017-04-07.
 */
public class MemberReview {
    //나이들의 평균

    public double calcAverageAge(List<Member> list) { //list<Member>라는 형식을 쓴 것임 원래는String있잖아 그니까 그것처럼 Member라는게 있는거야 그리고 새로운 변수 a잡기 그리고 앞에 변수와 비슷하게 list를 적는 편이 혼선 없고 좋음.
        int listLengthSum = 0;
        double listLengthAverage =0;
        int listLength = list.size();
        for (Member e : list) { //이것은 String 형태가 아니라 Member 형식이다
            listLengthSum += e.getAge(); //앞에 Member class에 넣어야하니까( 앞에 int age준 것 생각하기!) ,앞에 private처리해서 getScore()함.메서드 통해야 함

            //System.out.println(listLengthSum);
        }
        listLengthAverage = (double)listLengthSum / listLength;
        //System.out.println(listLengthAverage);
        return listLengthAverage;
    }

    //리스트 중에서 김씨성 가진 사람 몇 명인지 구하기
    public int howManyMembersWithLastName(List<Member> list) {

        List<Member> kims = new ArrayList<>();//김씨 성만 추출하여 새로운 리스트에 넣으려면 새로운 리스트 선언해야 함.
        int kimsAmount = 0;
        for (Member e : list) {
            if (e.getName().substring(0, 1).equals("김")) {//리스트에서 이름만 불러와서 앞 글자 추출 후 equals를 써서 성이 김 만 추출 e에서 추출하는 것임.
                kims.add(e);
                kimsAmount = kims.size();//김씨 성을 가진 사람의 수를 구하는 것이 목표이므로 수를 구할 수 있는 메서드 size()사용
                //System.out.println(kimsAmount);
            }

        }
        return kimsAmount;
    }

    //이메일 @ 앞까지 잘라서 그 글자수의 평균 구하기
    public double calcAverageIdChar(List<Member> list) {

        int sum = 0;
        String after ;

        for (Member e : list){
            after = e.getEmail();//Member에 있는 getter로 Email을 불러오기.
            int gab = after.indexOf('@'); //indexOf('@')는 @전까지 몇 번째 숫자인지 알고 싶을 때 사용
            String aa = after.substring(0,gab); //substring은 0번째부터 gab번째(@ 전까지 수)까지만 놔두고 자름
            sum += aa.length(); //그럼 이메일에서 @전까지 잘린 것이 String aa니까 그 안의 수를 구하려면 length()를 써야 함.
            //String dd = Arrays.toString(after.split("@"));
            //System.out.printf("나눔 %s ",aa);
            //sum += dd.length;
            //System.out.printf("수 %d \n", aa.length());
        }

        double average = sum / list.size();

        return average;
    }
}


