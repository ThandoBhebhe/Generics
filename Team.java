import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;

    private int played = 0;
    private int won  = 0;
    private int lost = 0;
    private int drew = 0;

    private ArrayList<T> teamMembers = new ArrayList<>();

    public Team(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean addPlayer(T player) {
        if(teamMembers.contains(player)){
            System.out.println("Team member \""+player.getName()+ "\t is already in the team");
            return false;
        }
        teamMembers.add(player);
        System.out.println(player.getName()+" has been added to "+this.name);
        return true;
    }

    public int numOfPlayers(){
        return this.teamMembers.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){

            message = "Won against";
            won++;

        }else if(ourScore == theirScore){

            message = "Drew against";
            drew++;
        }else{
            message = "Lost against";
            lost++;
        }
        this.played++;

        if(opponent != null){
            opponent.matchResult(null, theirScore, ourScore);
            System.out.println("You "+message+" "+opponent.getName());
        }



    }

    public int getRank(){
        return (won * 3)+(drew*2);
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.getRank() > team.getRank()){
            return -1;
        }else if(this.getRank() < team.getRank()){
            return 1;
        }else{
            return 0;
        }
    }
}
