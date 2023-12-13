import java.util.ArrayList;

public class FifaWorldCup extends Trophy{
    private int teams;
    private String host;
    private String winner;
    private ArrayList<FootballTeam> FootballList = new ArrayList<>();

    public FifaWorldCup(String name, int year, int price,int teams,String host,String winner,ArrayList<FootballTeam> FootballList) {
        super(name, year, price);
        this.FootballList = FootballList;
        this.host = host;
        this.teams = teams;
        this.winner = winner;
    }
    public void AddFootballTeam(FootballTeam team){
        FootballList.add(team);
    }
    public void RemoveFootballTeam(FootballTeam team){
        FootballList.remove(team);
    }

    public int getTeams() {
        return teams;
    }

    public String getHost() {
        return host;
    }

    public String getWinner() {
        return winner;
    }

    public void setTeams(int teams) {
        this.teams = teams;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
    public void ShowFifaCupDetails(){
        System.out.println(getName());
        System.out.println("World Cup Held in Year "  + getYear());
        System.out.println("There are " + teams  + " teams in Race Of Fifa Cup");
        System.out.println(host + " Host THE Fifa cup");
        System.out.println(winner + " is The Winner Tournament");
        System.out.println("Price Money For Winner is : " + getPrice());

    }

    public void FifaCupDetails(){

    }
    public boolean searchTeam(String name){
        for(int i = 0; i < FootballList.size(); i++){
            if(FootballList.get(i).teamName.equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    public void FifaCupTeamsDetails(){
        for(int i = 0; i < FootballList.size(); i++){
            FootballList.get(i).displayFifaTeamsDetails();
        }

    }
}
