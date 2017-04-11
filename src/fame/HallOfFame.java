package fame;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class HallOfFame {

    private String playerId;
    private int yearid;
    private String votedBy;
    private int ballots;
    private int needed;
    private int votes;
    private boolean inducted;
    private String neededNote;

    @Override
    public String toString() {
        return "HallOfFame{" +
                "playerId='" + playerId + '\'' +
                ", yearid=" + yearid +
                ", votedBy='" + votedBy + '\'' +
                ", ballots=" + ballots +
                ", needed=" + needed +
                ", votes=" + votes +
                ", inducted=" + inducted +
                ", neededNote='" + neededNote + '\'' +
                '}';
    }

    HallOfFame(){

    }

    public HallOfFame(String playerId, int yearid, String votedBy, int ballots, int needed, int votes, boolean inducted, String neededNote) {
        this.setPlayerId(playerId);
        this.setYearid(yearid);
        this.setVotedBy(votedBy);
        this.setBallots(ballots);
        this.setNeeded(needed);
        this.setVotes(votes);
        this.setInducted(inducted);
        this.setNeededNote(neededNote);
    }


    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getYearid() {
        return yearid;
    }

    public void setYearid(int yearid) {
        this.yearid = yearid;
    }

    public String getVotedBy() {
        return votedBy;
    }

    public void setVotedBy(String votedBy) {
        this.votedBy = votedBy;
    }

    public int getBallots() {
        return ballots;
    }

    public void setBallots(int ballots) {
        this.ballots = ballots;
    }

    public int getNeeded() {
        return needed;
    }

    public void setNeeded(int needed) {
        this.needed = needed;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public boolean isInducted() {
        return inducted;
    }

    public void setInducted(boolean inducted) {
        this.inducted = inducted;
    }

    public String getNeededNote() {
        return neededNote;
    }

    public void setNeededNote(String neededNote) {
        this.neededNote = neededNote;
    }
}
