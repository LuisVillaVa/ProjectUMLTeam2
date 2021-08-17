import java.util.Date;

public class Transport extends Trip {
    String typeTransport;
    double priceTicket;
    String timeArrive;
    String timeDeparture;

    public Transport(){}
    public Transport(String destinationCountry, String destinationCity, Date startDate, Date endDate, String reasonTrip, String typeTransport, double priceTicket, String timeArrive, String timeDeparture) {
        super(destinationCountry, destinationCity, startDate, endDate, reasonTrip);
        this.typeTransport = typeTransport;
        this.priceTicket = priceTicket;
        this.timeArrive = timeArrive;
        this.timeDeparture = timeDeparture;
    }

    public String getTypeTransport() {
        return typeTransport;
    }

    public double getPriceTicket() {
        return priceTicket;
    }

    public String getTimeArrive() {
        return timeArrive;
    }

    public String getTimeDeparture() {
        return timeDeparture;
    }
    public void displayTransport(){
        System.out.println("-------------------\n"+ "* TRANSPORT*\n "+ "----------------\n"+
                            "Type of Transport is => " + typeTransport +
                            "\nPrice of Ticket is => " + priceTicket +
                            "\nTime to arrive is => " + timeArrive +
                            "\nTime to departure is => " + timeDeparture);
    }
}
