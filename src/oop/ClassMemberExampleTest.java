package oop;

/**
 * Created by Alix Gawon Lee on 2017-04-10.
 */
public class ClassMemberExampleTest {

    public static void main(String[]args){
        ClassMemberExample cme = new ClassMemberExample();//class를 바로 사용할 수 없으니까 불러오는 것.

        int b = ClassMemberExample.getStaticTest();//static 메서드는 Class를 통해서 바로 접근할 수 있음. 가면 갈 수록 사용 빈도수 늘음.

        int a = ClassMemberExample.CLASS_MEMBER;

        System.out.println(a);
        System.out.println(b);
    }
}
