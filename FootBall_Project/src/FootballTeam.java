public class FootballTeam extends Teams{
    int timesFifaWins;
    String coachName;

    public FootballTeam(String teamName, String captain,int timesFifaWins,String coachName) {
        super(teamName, captain);
        this.coachName = coachName;
        this.timesFifaWins = timesFifaWins;
    }

    public int getTimesFifaWins() {
        return timesFifaWins;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setTimesFifaWins(int timesFifaWins) {
        this.timesFifaWins = timesFifaWins;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }
    public void displayFifaTeamsDetails(){
        System.out.println("***************************");
        System.out.println("Team Name : "+this.teamName);
        System.out.println("Captain : "+this.captain);
        System.out.println("Coach Of Team is : " +this.coachName);
    }
}
