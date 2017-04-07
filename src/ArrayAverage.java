/**
 * Created by Alix Gawon Lee on 2017-04-05.
 */



public class ArrayAverage {
    public static void main(String[]args){



        int[] iArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,
                18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};

        double result = calcAverage(iArr);


        System.out.println("배열의 평균은" + result + "입니다.");






    }

    public static double calcAverage(int[] intArr){  //파라미터로 인트형 배열이 들어감
        int sum = 0;
        for (int e : intArr) {
            sum +=e;
        }

        return (double)sum / intArr.length;
    }
}
