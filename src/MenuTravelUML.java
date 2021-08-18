import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuTravelUML {
    private String birthdate;
    private float hotelPrice;
    private float priceTicket;

    SimpleDateFormat obj = new SimpleDateFormat("dd/MM/yyyy");

    Person person;
    Trip trip = new Trip();
    Hotel hotelTrip= new Hotel();
    Credit tripPaymentCredit = new Credit(0f, 0);
    Cash tripPaymentCash = new Cash(0f);
    Transport transport = new Transport();

    public void addPerson(){
        System.out.println("Datas of the Person : " +"\n======================="+"\nPlease, Enter first name ");
        String firstName = ReadKeyBoard.readChain();
        System.out.println("Please, Enter last name");
        String lastName = ReadKeyBoard.readChain();
        System.out.println("Please, Enter address");
        String address = ReadKeyBoard.readChain();
        System.out.println("Please, Enter Date of birth  with Format 'dd/MM/YYYY'");
        birthdate = ReadKeyBoard.readChain();
        person = new Person(firstName, lastName, address );
    }

    public void addTravel() throws ParseException {
        //Date dateStart = obj.parse("09/08/2021");
        //Date dateEnd = obj.parse("18/09/2021");
        //trip.setStartDate(dateStart);
        //trip.setEndDate(dateEnd);
        System.out.println("Data of Destination: " +"\n======================="+"\nPlease, Enter Country destination ");
        String destination = ReadKeyBoard.readChain();
        System.out.println("Please, enter City destination");
        String destCity = ReadKeyBoard.readChain();
        System.out.println("Reason of Travel ");
        String reason = ReadKeyBoard.readChain();

        System.out.println("Enter Start date with format 'dd/MM/yyyy'");
        String startDate = ReadKeyBoard.readChain();
        System.out.println("Enter End date with format 'dd/MM/yyyy'");
        String endDate = ReadKeyBoard.readChain();
        Date start = obj.parse(startDate);
        Date end = obj.parse(endDate);

        trip.setDestinationCountry(destination);
        trip.setDestinationCity(destCity);
        trip.setReasonTrip(reason);
        trip.setStartDate(start);
        trip.setEndDate(end);
    }

    public void addHotel(){
        System.out.println("Data of the Hotel: " +"\n======================="+"\nPlease, Enter Hotel name ");
        String hotelname = ReadKeyBoard.readChain();
        System.out.println("Please, Enter Hotel Category ");
        int hotelcategori = ReadKeyBoard.readInt();
        System.out.println("Please, Enter Hotel Email ");
        String hotelEmail = ReadKeyBoard.readChain();
        System.out.println("Please, Enter type room ");
        String hotelroom= ReadKeyBoard.readChain();
        System.out.println("Please, Enter price ");
        hotelPrice = ReadKeyBoard.readFloat();
        hotelTrip.setName(hotelname);
        hotelTrip.setCategory(hotelcategori);
        hotelTrip.setEmailHotel(hotelEmail);
        hotelTrip.setRoom(hotelroom);
        hotelTrip.setPriceHotel(hotelPrice);

    }

    public void chooseTypePayment(){
        //System.out.println("\n======================="+"\n");
        float price = trip.getTotalPrice(priceTicket, hotelPrice);

        System.out.println("\n=======================\n"+
                "1. Credit"+"\n"+
                "2. Cash " +"\n"+
                "=======================\n");
        int chooseMenu1 = ReadKeyBoard.readInt();
        if (chooseMenu1==1){
            System.out.println("Please, Enter the number of quotas  ");
            int quotas = ReadKeyBoard.readInt();
            tripPaymentCredit.setPrice(price);
            tripPaymentCredit.setQuotas(quotas);
            tripPaymentCredit.display();
        }
        else if (chooseMenu1==2){
            System.out.println("Please, Enter discount percentage  ");
            float desc = ReadKeyBoard.readFloat();
            tripPaymentCash.setPrice(price);
            tripPaymentCash.setDiscountPorc(desc);
            tripPaymentCash.display();
        }
        else
        {
            System.out.println("Enter value 1 or 2");
        }
    }

    public void addTransport() throws ParseException {
        SimpleDateFormat objTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println( "Data of the Transport: " + "\n==============="+"\nEnter the type of transport that you are going to travel : ");
        String typeTransport = ReadKeyBoard.readChain();
        System.out.println("Enter the price of ticket");
        priceTicket = ReadKeyBoard.readFloat();
        System.out.println("Enter the Date Time to arrive int he follow format 'dd/mm/YY HH:mm:ss'");
        String arriveDate = ReadKeyBoard.readChain();
        System.out.println("Enter the Date Time to departure int he follow format 'dd/mm/YY HH:mm:ss'");
        String departureDate = ReadKeyBoard.readChain();
        transport.setTypeTransport(typeTransport);
        transport.setPriceTicket(priceTicket);
        Date arrive = objTime.parse(arriveDate);
        Date departure = objTime.parse(departureDate);

        transport.setTimeArrive(arrive);
        transport.setTimeDeparture(departure);
    }

    public void getAgePerson(){
        person.calculateAge(birthdate);
    }

    public String displayPerson(){
        return person.displayData()+"\n";
    }

    public void displayTravel(){
        trip.displayTrip();
    }

    public void displayHotel(){
        hotelTrip.displayHotel();
    }

    public void displayTransport(){
        transport.displayTransport();
    }
}
