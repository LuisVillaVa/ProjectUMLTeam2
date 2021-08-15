public class Tournament {
    private String startDate;
    private String endDate;
    private String headquearters;

    public Tournament(){}

    public Tournament(String startDate, String endDate, String headquearters) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.headquearters = headquearters;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getHeadquearters() {
        return headquearters;
    }
}