public class Tournament {
    private String startDate;
    private String endDate;
    private String headquarters;

    public Tournament(){}

    public Tournament(String startDate, String endDate, String headquarters) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.headquarters = headquarters;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public String displayDataTournament(){
        return "-----------------------\n * The tournament has been defined correctly * \n-----------------------\n"+
                "Start Date: " + getStartDate() +"\n"+
                "End Date: " + getEndDate() +"\n"+
                "Headquarter: "+ getHeadquarters();
    }
}