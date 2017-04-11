package inheritance;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Parent {

    private int age;
    private String name;
    public void  smoke(){

    }//오버라이딩 대상이 되면 런타임 바인딩 대상이 되어서 속도가 느려질 수 있음. 그래서 final 메서드를 사용한 것임. 실무에서는 쓸 일 없음.


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
