public class TeamPoint {
    private String StartDate;
    private String teamId;
    private String team;
    private String sportDiscipline;
    private int teamPoint;

    public TeamPoint(){}

    public TeamPoint(String startDate, String teamId, String team, String sportDiscipline, int teamPoint) {
        StartDate = startDate;
        this.teamId = teamId;
        this.team = team;
        this.sportDiscipline = sportDiscipline;
        this.teamPoint = teamPoint;
    }

    public String getStartDate() {
        return StartDate;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getTeam() {
        return team;
    }

    public String getSportDiscipline() {
        return sportDiscipline;
    }

    public int getTeamPoint() {
        return teamPoint;
    }
}
