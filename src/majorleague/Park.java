package majorleague;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class Park {
    private String parkKey;
    private String parkName;
    private String parkAlias;
    private String parkCity;
    private String parkState;
    private String parkCountry;




    public Park(){

    }//파라미터 없는 생성자, 그냥 생성자 만드려면 꼭 하나 만들어놓아야 함

    public Park(String parkKey, String parkName , String parkAlias, String parkCity, String parkState,String parkCountry){
        this.setKey(parkKey);
        this.setName(parkName);
        this.setAlias(parkAlias);
        this.setCity(parkCity);
        this.setState(parkState);
        this.setCountry(parkCountry);

    }//생성자를 만들어서 쓰면 편함. setter쓰는 곳도 있고 생성자 쓰는 곳도 있고 케바케임. Generate가서도 생성자는 물론 게터세터 쉽게 만들 수 있음.


    public String getKey() {
        return parkKey;
    }

    public void setKey(String parkKey) {
        this.parkKey = parkKey;
    }

    public String getName() {
        return parkName;
    }

    public void setName(String name) {
        this.parkName = parkName;
    }

    public String getAlias() {
        return parkAlias;
    }

    public void setAlias(String alias) {
        this.parkAlias = parkAlias;
    }

    public String getCity() {
        return parkCity;
    }

    public void setCity(String city) {
        this.parkCity = parkCity;
    }

    public String getState() {
        return parkState;
    }

    public void setState(String state) {
        this.parkState = parkState;
    }

    public String getCountry() {
        return parkCountry;
    }

    public void setCountry(String country) {
        this.parkCountry = parkCountry;
    }


}
