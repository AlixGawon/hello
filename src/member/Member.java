package member;

/**
 * Created by Alix Gawon Lee on 2017-04-07.
 */
public class Member {
    private String name; //멤버 변수는 생성될 때 자동으로 초기화 됨.
    private int age;
    private String hpNum;
    private String email;

//getter, setter 생성. Refactor 사용하면 바로 만들 수 있음!
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHpNum() {
        return hpNum;
    }

    public void setHpNum(String hpNum) {
        this.hpNum = hpNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Member() {

    }

    public Member(String name, int age, String hpNum, String email) {
        this.name = name;
        this.age = age;
        this.hpNum = hpNum;
        this.email = email;
    }
}
