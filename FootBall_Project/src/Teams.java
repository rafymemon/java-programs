public class Teams {
    String teamName;
    String captain;

    public Teams(String teamName, String captain) {
        this.teamName = teamName;
        this.captain = captain;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCaptain() {
        return captain;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }
}
