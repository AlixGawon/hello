package wordcount;

import wordcount.wordcountservice.WordCountService;
import wordcount.wordcountservice.WordCountServiceImpl;
import wordcount.wordcountservice.WordCountService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class WordCountMain {
    public static void main(String[] args)  {

        //파일 불러와서 보기 쉽게 BufferedReader 형식으로 변환한 후 데이터 리스트 만들기
        BufferedReader br = null;//throws Exception 안 해주면 FileReader 에러뜸
        try {
            br = new BufferedReader(new FileReader("src\\closer.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();//예외에 대한 것을 화면에 출력시켜준다.
        }
        try {
            String line = br.readLine();
            System.out.println(line);
            //첫 번째 라인 스킵 (전체 빨간색 나오면 예외처리임 그러면 빨간 전구 선택해서 try catch문 만들기!)
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> list = new ArrayList<>(); //파일에서 나온 데이터 리스트 만들기 그리고 WordCountService에 갖다줌

        String line = ""; //미리 설정

        //단어 하나하나로 나누기

        try {
            while ((line = br.readLine()) !=null) {// 읽다가 공백이 나올 경우를 설정

                String[] splitted = line.split(" "); //String[] 객체를 splitted로 설정 후 스페이스(공백)으로 나눈다.String[]로 return하는 것.

                for (String e : splitted) {//따로 클래스를 만든 것이 아니기 때문에 그냥 String으로 지정해도 됨.
                    list.add(e); //list에 e를 넣는다.
                    //System.out.println(e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        //wordCountService에 있는 함수 출력하기
//        WordCountService service = new WordCountService();
//        int aver = service.getWordCount(list);
//        System.out.println(aver);
        WordCountService service = new WordCountServiceImpl();//인터페이스 이용
        int count = service.getWordCount(list);//데이터를 실제로 분석하는 함수
        System.out.println(count);


    }
}
