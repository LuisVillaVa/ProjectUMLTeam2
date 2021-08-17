import java.util.*;

public class Team {
    private String nameTeam;
    private String coach;
    private int numPlayer;
    private int playerUp;
    private int playerDown;

    private Map<String,Player> players = new HashMap<String,Player>();

    public Team(){}

    public Team(String nameTeam, String coach) {
        this.nameTeam = nameTeam;
        this.coach = coach;
    }

    ArrayList teamPlayer(){

        ArrayList   result = new ArrayList();

        result.add(this.nameTeam);

        if ((this.players).size() == 0) {
            result.add("The club has not signed players.");
        }
        else {
            Iterator it = (this.players).entrySet().iterator();
            List<String> dataPlayer = new ArrayList<>();
            Map.Entry   e;
            Player     player;

            while (it.hasNext()) {
                e = (Map.Entry)it.next();
                player = (Player) e.getValue();
                dataPlayer.add(player.displayData());
                result.add(dataPlayer);
            }
        }

        return result;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }
}