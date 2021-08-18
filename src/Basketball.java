public class Basketball extends Player{
    private String nameLeague;
    private int homeScore = 0, awayScore = 0, quarter = 1;
    private String homeTeam, awayTeam;
    private boolean gameStatus;

    public Basketball(){};

    public Basketball(String homeTeam, String awayTeam, int homeScore, int awayScore){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        gameStatus = true;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScore(){
        return homeScore;
    }

    public int getAwayScore(){
        return awayScore;
    }

    public void setHomeScore(int h){
        do{
            try{
                switch (h){
                    case 1:
                        homeScore++;
                        break;
                    case 2:
                        homeScore+=2;
                        break;
                    case 3:
                        homeScore+=3;
                        break;

                }
            } catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }while(h >= 1 & h <= 3);
    }

    public void setAwayScore(int a){
        do{
            try{
                switch (a){
                    case 4:
                        awayScore++;
                        break;
                    case 5:
                        awayScore+=2;
                        break;
                    case 6:
                        awayScore+=3;
                        break;

                }
            } catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }while(a >= 4 & a <= 6);
    }

    public void setPeriod() {
        quarter++;

        if(quarter > 4){
            gameStatus = false;
        }
    }

    public int getPeriod() {
        return quarter;
    }

    /*
     * Returns true if game is still going
     */
    public boolean isGameStatus(){
        if(gameStatus){
            return true;
        }
        else{
            return false;
        }
    }

    /*
     * Gets the winner of the game
     */
    public String getWinner(){
        if(getHomeScore() > getAwayScore()){
            return getHomeTeam();
        }
        else {
            return getAwayTeam();
        }
    }
}