import java.util.ArrayList;

public class WorldCupODI extends Trophy{
    private int teams;
    private String winner;
    private String host;
    private ArrayList<CricketTeam> ODIteamsList = new ArrayList<>();

    public WorldCupODI(String name, int year, int price,int teams,String host,String winner,ArrayList<CricketTeam> ODIteamsList) {
        super(name, year, price);
        this.ODIteamsList = ODIteamsList;
        this.host = host;
        this.teams = teams;
        this.winner = winner;
    }

    public void AddCricketTeam(CricketTeam team){
        ODIteamsList.add(team);
    }
    public void RemoveCricketTeam(CricketTeam team){
        ODIteamsList.remove(team);
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

    public void ShowWorldCupDetailss(){
        System.out.println(getName());
        System.out.println("World Cup Held in Year "  + getYear());
        System.out.println("There are " + teams  + " teams in Race Of World Cup");
        System.out.println(host + " Host THE world cup");
        System.out.println(winner + " is The best on Tournament");
        System.out.println("Price Money For Winner is : " + getPrice());

    }

    public void worldCupDetails(){

    }
    public boolean searchTeam(String name){
        for(int i = 0; i < ODIteamsList.size(); i++){
            if(ODIteamsList.get(i).teamName.equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    public void worldCupTeamsDetails(){
        for(int i = 0; i < ODIteamsList.size(); i++){
            ODIteamsList.get(i).displayTeamsDetails();
        }

    }
}
