/**
 * Created by danawacomputer on 2017-04-04.
 */
public class CelsiusAndFahrenheit {
    public static void main(String[]args){

        double celsius = 0;
        double fahrenheit = 0;
        fahrenheit = 20;

        celsius = (fahrenheit - 32) / 1.8;

         System.out.println("화씨 20도는 섭씨로" + celsius + "입니다.");

         celsius = 50;
         fahrenheit = (celsius * 1.8) + 32;

         System.out.println("섭씨 50도는 화씨로" + fahrenheit + "입니다.");






        System.out.println("");
   }
}



