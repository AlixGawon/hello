package fame;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class PlayerAverage {
    //필드
    private String playerId;
    private int average;

    //생성자
    public PlayerAverage() {
    }

    public PlayerAverage(String playerId, int average) {
        this.playerId = playerId;
        this.average = average;
    }

    //Method
    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }



}
