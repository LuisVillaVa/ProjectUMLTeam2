import java.util.Date;

public class Trip {
    private String destinationCountry;
    private String destinationCity;
    private Date startDate;
    private Date endDate;
    private String reasonTrip;
    private float totalPrice = 0;

    public  Trip(){

    }
    public Trip( String destinationCountry, String destinationCity, Date startDate, Date endDate, String reasonTrip ) {

        this.destinationCountry = destinationCountry;
        this.destinationCity = destinationCity;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reasonTrip = reasonTrip;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getReasonTrip() {
        return reasonTrip;
    }
    public void setReasonTrip( String reasonTrip) {
        this.reasonTrip = reasonTrip;
    }
    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public float getTotalPrice(float priceTicket, float priceHotel) {
        return priceTicket+priceHotel;
    }

    public void  displayTrip() {
        System.out.println("-----------------------\n"+ "*  TRIP *\n "+ "-----------------------\n"+
                            "Destination Country  is => " + destinationCountry +
                            "\nDestination City  is => " + destinationCity +
                            "\nStart Date => " + startDate +
                            "\nEnd Date => " + endDate +
                            "\nReason of Trip => " + reasonTrip );


    }
}
