package gourmet;

import gourmet.Gourmet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alix Gawon Lee on 2017-04-07.
 */
public class GourmetService {
       public double calcAverageScore(List<Gourmet> a) { //list<Gourmet>라는 형식을 쓴 것임 int
          int listLengthSum = 0;
          double listLengthAverage =0;
          int listLength = a.size();
           for (Gourmet e : a) { //이것은 String 형태가 아니라 Gourmet 형식이다
               listLengthSum += e.score; //앞에 Gourmet class에 넣어야하니까( 앞에 int score준 것 생각하기!)

               System.out.println(listLengthSum);
           }
           listLengthAverage = (double)listLengthSum / listLength;
           System.out.println(listLengthAverage);
           return listLengthAverage;
       }
}
