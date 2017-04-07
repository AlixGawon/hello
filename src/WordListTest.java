/**
 * Created by Alix Gawon Lee on 2017-04-06.
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class WordListTest {
public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    String word = "";
    int wordListLength = 0;
    int sum = 0;
    double average = sum / (double) wordListLength;
    List<String> newWordList = new ArrayList<>(); //단어 글자가 5개 이하인 리스트 담을 새로운 리스트

    System.out.print("단어 여러개 입력하세요");
    word = in.nextLine();
    List<String> wordList = new ArrayList<String>(Arrays.asList(word.split(" ")));//단어 하나하나 받기

    for (String e : wordList){
        wordListLength = e.length();
        sum += wordListLength;
        //System.out.print(sum);
        if (e.length() <= 5) {
        newWordList.add(e);
        System.out.print(e);

        }


    }



}
/*public static double getAverageFromList (List<String>wordList, int wordListLength, int sum) {
    for (String e : wordList){
        wordListLength = e.length();
        sum += wordListLength;
        double getAverageFromList = (double) sum / wordList.size();
    return getAverageFromList;
}
public static List<String> getListLessThanFive (List<String>WordList) {

    }
        for (String e : wordList) {//새롭게 시작
            List<String> newWordList = new ArrayList<String>();//새로운 배열 선언
            if (e.length() <=5) {
            newWordList.add(e);
        }

        return newWordList;

    }*/
}
