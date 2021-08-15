import java.util.ArrayList;
import java.util.List;

public class ListPlayer {
    List<Player> listPlayer = new ArrayList<>();

    void addPlayer(Player player) {
        this.listPlayer.add(player);
    }

    void displayPlayer(){
        listPlayer.forEach(s-> System.out.println(s.displayData()));
    }
}
