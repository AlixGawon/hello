package gourmet;

/**
 * Created by Alix Gawon Lee on 2017-04-07.
 */
public class Gourmet {
    private String title;
    private String mainMenu;
    private int score;//private를 이용하면 외부에서 못 씀 값을 get, set 다 못 함 그러면 메서드를 이용!!!!

    public String getTitle(){ //getter(accessor) setter(mutator) 만드는 공식이 있음.(네이밍 컨벤션) 앞에 get이나 set이 붙고 앞이 대문자로 바뀜
        return this.title;
    }
    public void setTitle(String t) {
        this.title = t;
    }public String getMainMenu(){ //getter(accessor) setter(mutator) 만드는 공식이 있음.앞에 get이나 set이 붙고 앞이 대문자로 바뀜
        return mainMenu;
    }
    public void setMainMenu(String m) {
        this.setTitle(m);
    }public int getScore(){ //getter(accessor) setter(mutator) 만드는 공식이 있음.앞에 get이나 set이 붙고 앞이 대문자로 바뀜
        return this.score;
    }
    public void setScore(int s) {
        this.score = s;
    }
    // 똑같은거 쓰기 귀찮으니까 멤버변수(필드)를 만들어 주는 것 있음. 리펙터에서 인캡슐레이션 필드 클릭 리펙토링은 실행은 똑같이 되지만 구성을 바꾸는 행위.

    //생성자 만들기(원래 항상 디폴트로 있지만 생략되어 있는 것.) 클래스와 이름이 같아야 함

    public Gourmet(){
        System.out.println("생성자 진짜 호출 되나요?");// 그럼 앞으로 Gourmet()생성자가 생략되어있는 곳에 이 문구가 뜬다. 확인해 보시라.
    }//파라미터가 없는 생성자

    public Gourmet(String title, String mainMenu, int score){
        this.title = title;
        this.mainMenu = mainMenu;
        this.score = score;
    }//생성자를 만들어서 쓰면 편함. setter쓰는 곳도 있고 생성자 쓰는 곳도 있고 케바케임. Generate가서도 생성자는 물론 게터세터 쉽게 만들 수 있음.


}
