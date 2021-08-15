public class Team {
    private String nameTeam;
    private int numPlayer;
    private int playerUp;
    private int playerDown;

    public Team(){}

    public Team(String nameTeam, int numPlayer, int playerUp, int playerDown) {
        this.nameTeam = nameTeam;
        this.numPlayer = numPlayer;
        this.playerUp = playerUp;
        this.playerDown = playerDown;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public int getNumPlayer() {
        return numPlayer;
    }

    public int getPlayerUp() {
        return playerUp;
    }

    public int getPlayerDown() {
        return playerDown;
    }
}