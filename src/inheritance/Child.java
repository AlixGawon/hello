package inheritance;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Child extends Parent {

    private String hobby;

    @Override//어노테이션을 붙였는데 아무 에러 안 뜨면 100프로 상속 되었다 생각하기!!!!!
    public void smoke() {
        System.out.println("아들이 담배를 핍니다.");
    }


    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
