package wordcount.wordcountservice;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public interface WordCountService { //인터페이스 존재 이유 : 확장성 나중에 수정할 때 또 다른 class 추가 안 할 수 있고 똑같은 변수 사용할 수 있음
    int getWordCount (List<String> list);
}
