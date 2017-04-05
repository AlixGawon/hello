/**
 * Created by Alix Gawon Lee on 2017-04-05.
 */
public class ArrayExample {
    public static void main(String[]args){
        /*
        int[] iArr = new int[10];

        iArr[0] = 2;
        iArr[1] = 4;
        iArr[2] = 6;
        iArr[3] = 8;
        iArr[4] = 10;
        iArr[5] = 12;
        iArr[6] = 14;
        iArr[7] = 16;
        iArr[8] = 18;
        iArr[9] = 20;

        iArr[4] = 35000;//배열은 다시 값 지정하는 것이 가능함

        System.out.println(iArr[0]);
        System.out.println(iArr[1]);
        System.out.println(iArr[2]);
        System.out.println(iArr[3]);
        System.out.println(iArr[4]);
        System.out.println(iArr[5]);
        System.out.println(iArr[6]);
        System.out.println(iArr[7]);
        System.out.println(iArr[8]);
        System.out.println(iArr[9]);


       /* int[] iArr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};//for 조건문으로 배열을 순회하려 한다.
        //iArr만큼 반복한다!


        /* 내가 잘못한 예
        for (int e ; iArr;) {
            if (e%5==0) {
                System.out.println("빙고!");
            }
        }
<선생님이 하신 것>
        for (int e: iArr) {
            if (e % 5 == 0){
                System.out.println("bingo");
            } else {
                System.out.println(e);
            }

        }
*/
        int[] iArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

        for (int e : iArr) {
            String converted = String.valueOf(e);//숫자가 문자형태로 바뀐다

            if (converted.contains("3") || converted.contains("6") || converted.contains("9")) {
                System.out.println("짝!");

            } else {
                System.out.println(converted);
            }
        }
    }
}
