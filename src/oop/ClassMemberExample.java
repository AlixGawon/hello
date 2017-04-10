package oop;

/**
 * Created by Alix Gawon Lee on 2017-04-10.
 */
public class ClassMemberExample {

    public static int CLASS_MEMBER = 5;//static이 붙으면 상수로 취급. 모든 클래스가 공유할 수 있음 그래서 데이터가 잘 안 맞는 일이 생김
    // 네이밍이 무조건 대문자여야 함

    private int number;
    private String aString;

    public static int getStaticTest(){ //static 메서드
        return 15;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }
}
