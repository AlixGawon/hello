package salary;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Salary {
    private String yearID;
    private String teamID;
    private String lgID;
    private String playerID;
    private int salary;

    public Salary(){

    }//생성자 메서드 만들기


    public Salary(String yearID, String teamID, String lgID, String playerID, int salary) {
        this.yearID = yearID;
        this.teamID = teamID;
        this.lgID = lgID;
        this.playerID = playerID;
        this.salary = salary;
    }//이거 꼭 만들어야함!

    public String getYearID() {
        return yearID;
    }

    public void setYearID(String yearID) {
        this.yearID = yearID;
    }

    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public String getLgID() {
        return lgID;
    }

    public void setLgID(String lgID) {
        this.lgID = lgID;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override//반드시 이거 만들어 놓기! 일종의 룰임.
    public String toString() {
        return "Salary{" +
                "yearID='" + yearID + '\'' +
                ", teamID='" + teamID + '\'' +
                ", lgID='" + lgID + '\'' +
                ", playerID='" + playerID + '\'' +
                ", salary=" + salary +
                '}';

    }
}

