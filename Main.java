import java.util.ArrayList;

public class Main {

    public static void main(String[]args) {

        FootballPlayer tallBg = new FootballPlayer("tallBg");
        BaseballPlayer basep = new BaseballPlayer("baser");
        SoccerPlayer becham= new SoccerPlayer("becham");

        Team<FootballPlayer>americanFootballers = new Team<>("AdelaideCrows");
        Team<FootballPlayer>pirates = new Team("Pirates");
        Team<FootballPlayer>chiefs = new Team("Chiefs");


        americanFootballers.matchResult(chiefs, 1,1); //This is the line that starts all the errors

        System.out.println(chiefs.getRank());

        Team <SoccerPlayer>soccerTeam = new Team<>("AdelaideCrows");

        Team <BaseballPlayer>baseballTeam = new Team<>("AdelaideCrows");

        americanFootballers.addPlayer(tallBg);
        baseballTeam.addPlayer(basep);
        soccerTeam.addPlayer(becham);


        System.out.println(americanFootballers.numOfPlayers());


    }

}