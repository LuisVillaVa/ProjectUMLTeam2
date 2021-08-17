
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    private static int menuIntialTravel(){
        //add your menu of travel here
        return 0;
    }

    private static int menuInitialPlayer() throws Exception{

        System.out.println("\n============================================\n"+
                "1. Gets the data of the player Luis"+"\n"+
                "2. Adds and show list of players"+"\n"+
                "3. VIew that team going to play"+"\n"+
                "4. Gets winner team of the play of basketball"+"\n"+
                "5. Gets the characteristics of the Bicycle of the cyclist"+"\n"+
                "6. Gets the data a swim participant"+"\n"+
                "7. Gets the swimming style "+"\n"+
                "8. Show if the swimming competition started "+"\n"+
                "0. Finish\n"+
                "====================================================\n");
        return(ReadKeyBoard.readInt());

    }

    private static void addPlayer(ListPlayer player) throws Exception{
        boolean morePlayer = true;
        String name;
        String discipline;
        double height;
        double weight;

        while(morePlayer){
            System.out.println("Enter a name: ");
            name = ReadKeyBoard.readChain();
            System.out.println("Enter dicipline: ");
            discipline = ReadKeyBoard.readChain();
            System.out.println("Enter height: ");
            height = ReadKeyBoard.readDouble();
            System.out.println("Enter weight");
            weight = ReadKeyBoard.readDouble();
            player.addPlayer(new Player(name, discipline, height, weight));
            System.out.println("Add more players");
            System.out.println("If your want to add more players enter 'true' otherwise enter 'false'");
            morePlayer = ReadKeyBoard.readBoolean();
        }
    }

    public static void main(String[] arg) throws ParseException {
        int option = 0;
        System.out.println("\n==================================================\n"+
                            "1. Travel"+"\n"+
                            "2. Player"+"\n"+
                            "==================================================\n");
        int chooseMenu = ReadKeyBoard.readInt();
        if(chooseMenu==1){



               // Scanner readKeyBoard = new Scanner(System.in);

                System.out.println("Datas of the Person : " +"\n======================="+"\nPlease, Enter name ");
                String name = ReadKeyBoard.readChain();
                System.out.println("Please, Enter address");
                String address = ReadKeyBoard.readChain();
                System.out.println("Please, Enter birthday  with Format 'dd/MM/YYYY'");
                String birthday = ReadKeyBoard.readChain();

                Person person = new Person(name,  address );


                Trip trip = new Trip();
                SimpleDateFormat obj = new SimpleDateFormat("dd/MM/yyyy");
                Date dateStart = obj.parse("09/08/2021");
                Date dateEnd = obj.parse("18/09/2021");
                trip.setStartDate(dateStart);
                trip.setEndDate(dateEnd);
                System.out.println("Data of Destination: " +"\n======================="+"\nPlease, Enter Country destination ");
                String destination = ReadKeyBoard.readChain();
                System.out.println("Please, enter City destination");
                String destCity = ReadKeyBoard.readChain();
                System.out.println("Reason of Travel ");
                String reason = ReadKeyBoard.readChain();

                trip.setDestinationCountry(destination);
                trip.setDestinationCity(destCity);
                trip.setReasonTrip(reason);

                Hotel hotelTrip= new Hotel();
                System.out.println("Data of the Hotel: " +"\n======================="+"\nPlease, Enter Hotel name ");
                String hotelname = ReadKeyBoard.readChain();
                System.out.println("Please, Enter Hotel Category ");
                int hotelcategori = ReadKeyBoard.readInt();
                hotelTrip.setName(hotelname);
                hotelTrip.setCategory(hotelcategori);
                hotelTrip.getEmailHotel();

                System.out.println("Price of Travel  : " +"\n======================="+"\nPlease, Enter Price of travel ");
                float price = ReadKeyBoard.readFloat();


                       System.out.println("\n=======================\n"+
                                            "1. Credit"+"\n"+
                                            "2. Cash " +"\n"+
                                            "=======================\n");
                       int chooseMenu1 = ReadKeyBoard.readInt();
                            if (chooseMenu1==1){
                                System.out.println("Please, Enter the number of quotas  ");
                                int quotas = ReadKeyBoard.readInt();
                                Credit tripPaymentCredit = new Credit(0f, 0);
                                tripPaymentCredit.setPrice(price);
                                tripPaymentCredit.setQuotas(quotas);
                                tripPaymentCredit.display();
                            }
                            else if (chooseMenu1==2){
                                System.out.println("Please, Enter discount percentage  ");
                                float desc = ReadKeyBoard.readFloat();
                                Cash tripPaymentCash = new Cash(0f);
                                tripPaymentCash.setPrice(price);
                                tripPaymentCash.setDesc(desc);
                                tripPaymentCash.display();
                            }
                            else
                            {
                            System.out.println("Enter value 1 or 2");
                            }


                System.out.println(person.displayData());
                person.calculateAge(birthday);
                trip.displayTrip();
                hotelTrip.displayHotel();

        }
        else if (chooseMenu==2) {
            do {
                try {
                    option = menuInitialPlayer();
                    ListPlayer player = new ListPlayer();
                    switch (option) {
                        case 1:
                            Person person = new Person("Luis", "88774455", "15/08/1993",
                                    74586226, "Calle Fader", 'M');
                            System.out.println(person.displayData());
                            person.calculateAge(person.getBirthDate());
                            break;
                        case 2:
                            addPlayer(player);
                            player.displayPlayer();
                            break;
                        case 3:
                            Basketball basketball = new Basketball("Team Dragon", "Team SiquiMira", 5, 8);
                            System.out.println(basketball.getHomeTeam() + " vs " + basketball.getAwayTeam());
                            break;
                        case 4:
                            Basketball basketballResult = new Basketball("Team Dragon", "Team SiquiMira", 5, 8);
                            System.out.println("Team winner is: " + basketballResult.getWinner());
                            break;
                        case 5:
                            Cyclist cyclist = new Cyclist("Rocio", "Cyclist", 1.60, 56.0, true);
                            Bike bike = new Bike("Venzo", 29);
                            System.out.println("Cyclist");
                            System.out.println(cyclist.displayData());
                            System.out.println("Bicycle");
                            System.out.println(bike.displayBicycle());
                            break;
                        case 6:
                            Swim swim = new Swim("Juana", "Swimming", 1.66, 62.0, "Backstroke");
                            System.out.println(swim.displayData());
                            break;
                        case 7:
                            Swim swimStyle = new Swim("Backstroke");
                            System.out.println("The type of swimming style is: " + swimStyle.getStyle());
                            break;
                        case 8:
                            Swim swimBegin = new Swim(false);
                            System.out.println(swimBegin.startSwim());
                            break;
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } while (option != 0);
        }
        else{
            System.out.println("Enter value 1 or 2");
        }
    }
}