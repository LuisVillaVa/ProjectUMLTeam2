public class Trip {
    Person person;
    Payment payment;
    Hotel hotel;
    String destinationCountry;
    String destinationCity;
    String startDate;
    String endDate;
    String reasonTrip;

    public Trip(Person person, Payment payment , Hotel hotel , String destinationCountry, String destinationCity, String startDate, String endDate, String reasonTrip ) {
        this.person = person;
        this.payment = payment;
        this.hotel = hotel;
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

    public void  display() {
        System.out.println( "Destination Country  is => " + destinationCountry +
                            "\nDestination City  is => " + destinationCity +
                            "\nStart Date => " + startDate +
                            "\nEnd Date => " + endDate +
                            "\nReason of Trip => " + reasonTrip );

        hotel.displayHotel();
        person.displayData();
        payment.display();


    }
}
