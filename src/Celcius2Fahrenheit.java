/**
 * Created by Alix Gawon Lee on 2017-04-04.
 */
public class Celcius2Fahrenheit {
    public static void main(String[]args){

        double celsius = 20;


        Celcius2FahrenheitService service =
                new Celcius2FahrenheitService();
        double result = service.toFaranheit(celsius);

        String  str = new String("hello");

         System.out.println("섭씨 20도는 화씨로" + result + "입니다.");

   }
}



