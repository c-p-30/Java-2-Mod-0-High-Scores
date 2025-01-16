public class Player {
    private String initials;
    private int score;

    public Player(String initials, int score) {
        this.initials = initials;
        this.score = score;
    }
    public String getInitials() {
        return initials;
    }
    public Integer getScore() {
        return score;
    }
    public void setInitials(String initials) {
        this.initials = initials;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
}
