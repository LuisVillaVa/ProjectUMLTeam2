import java.util.ArrayList;
import java.util.List;

public class ListPlayer {
    List<Player> listPlayer = new ArrayList<>();
    List<Swim> listSwim = new ArrayList<>();

    void addSwim(Swim swim) {
        this.listSwim.add(swim);
    }

    void displaySwim(){
        listSwim.forEach(s-> System.out.println(s.displayData()));
    }

    void addPlayer(Player player) {
        this.listPlayer.add(player);
    }

    void displayPlayer(){
        listPlayer.forEach(s-> System.out.println(s.displayData()));
    }
}
