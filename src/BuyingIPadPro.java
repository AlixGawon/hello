/**
 * Created by Alix Gawon Lee on 2017-04-04.
 */
public class BuyingIPadPro {
    public static void main(String[]args){

        double ipadProPrice = 999_000.0;
        double discountRate = 15.0 / 100;
        double discountPrice = ipadProPrice * (1 - discountRate);
        //int discountPrice = (int)(ipadProPrice * (1 - discountRate));로 casting해줘도 됨

        System.out.println("iPad Pro 15% 세일 가격은 " + discountPrice + "입니다.");
    }
}
