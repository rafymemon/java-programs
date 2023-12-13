public class CricketTeam extends Teams{

    String headCoach;
    public CricketTeam(String teamName, String captain,String headCoach) {
        super(teamName, captain);
        this.headCoach = headCoach;
    }

    public String getHeadCoach() {
        return headCoach;
    }

    public void setHeadCoach(String headCoach) {
        this.headCoach = headCoach;
    }

    public void displayTeamsDetails(){
        System.out.println("***************************");
        System.out.println("Team Name : "+this.teamName);
        System.out.println("Captain : "+this.captain);
    }
}
