/**
 * Created by Alix Gawon Lee on 2017-04-05.
 */

import java.util.Scanner;

public class ProductPriceCalculateTest {
 public static void main(String[]args){

     Scanner in = new Scanner(System.in);

     double this_ = 4500;
     double malboro = 5200;

     System.out.print("담배 종류를 입력하세요 : 1. 디스  2. 말보로");
     int tabacco = in.nextInt();

     System.out.print("나이를 입력하세요 : ");
     int age = in.nextInt();

     System.out.print("수량을 입력하세요 : ");
     int amount = in.nextInt();


     double total = tabacco * amount;

     if (tabacco == 1) {
         total = amount * this_;
     } else if (tabacco == 2) {
         total = amount * malboro;
     }
     /*
      아예 디스나 말보로를 변수로 따로 두지 않는 방법도 있다
      int prodPrice = 0;
      if ( tabacco == 1) {
      prodPrice = 4500;
      } else if ( tabacco == 2){
      prodPrice = 5200;
      } else{}
     */


     if (20 >= age) {
         total = total * 0.8;
     } else if (age >= 45) {
        total = total * 1.3;
     }

     /*강사님 방법
     double total = prodPrice * amount;

     if(age < 19) {
     total = total * 0.8;
     } else if (age >= 45) {
     total = total * 1.3;
     }

      */

     System.out.printf("지불하실 금액은 %4.1f원 입니다!",total);
 }

}
