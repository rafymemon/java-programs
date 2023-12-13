import java.util.ArrayList;

public class WorldCupT20 extends Trophy{
    private int teams;
    private String host;
    private String winner;
    private ArrayList<CricketTeam> T20TeamList = new ArrayList<>();

    public WorldCupT20(String name, int year, int price,int teams,String host,String winner,ArrayList<CricketTeam> T20TeamList) {
        super(name, year, price);
        this.T20TeamList = T20TeamList;
        this.host = host;
        this.teams = teams;
        this.winner = winner;
    }
    public void AddCricketTeam(CricketTeam team){
        T20TeamList.add(team);
    }
    public void RemoveCricketTeam(CricketTeam team){
        T20TeamList.remove(team);
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

    public void ShowWorldCupDetail20(){
        System.out.println(getName());
        System.out.println("World Cup Held in Year "  + getYear());
        System.out.println("There are " + teams  + " teams in Race Of T20 World Cup");
        System.out.println(host + " Host THE world cup");
        System.out.println(winner + " is The Winner Of Tournament");
        System.out.println("Price Money For Winner is : " + getPrice());

    }
    public boolean searchTeam(String name){
        for(int i = 0; i < T20TeamList.size(); i++){
            if(T20TeamList.get(i).teamName.equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    public void worldCupTeamsDetails(){
        for(int i = 0; i < T20TeamList.size(); i++){
            T20TeamList.get(i).displayTeamsDetails();
        }

    }
}
