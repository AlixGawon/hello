package majorleague;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class Park {
    private String key;
    private String name;
    private String alias;
    private String city;
    private String state;
    private String country;




    public Park(){

    }//파라미터 없는 생성자, 그냥 생성자 만드려면 꼭 하나 만들어놓아야 함

    public Park(String key, String name, String alias, String city, String state,String country){
        this.setKey(key);
        this.setName(name);
        this.setAlias(alias);
        this.setCity(city);
        this.setState(state);
        this.setCountry(country);

    }//생성자를 만들어서 쓰면 편함. setter쓰는 곳도 있고 생성자 쓰는 곳도 있고 케바케임. Generate가서도 생성자는 물론 게터세터 쉽게 만들 수 있음.


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
