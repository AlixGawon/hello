/**
 * Created by Alix Gawon Lee on 2017-04-04.
 */
public class BuyingIPadPro {
    public static void main(String[]args){

        double ipadProPrice = 999_000.0;
        double discountRate = 15.0 / 100;

        //double discountPrice = ipadProPrice * (1 - discountRate);
        //int discountPrice = (int)(ipadProPrice * (1 - discountRate));로 casting해줘도 됨
        double resultPrice = getdiscountedPrice(ipadProPrice, discountRate); //기능 분리한 것


        System.out.println("iPad Pro 15% 세일 가격은 " + resultPrice + "입니다.");
    }
    //함수로 기능 분리
    public static double getdiscountedPrice( double ipadProPrice, double discountRate) {//이렇게 변수 새로 만들고 안의 매개변수는 바깥과 같은 이름으로
        return (double) ipadProPrice * (1 - discountRate); //계산할 식 적기

    }
    }
