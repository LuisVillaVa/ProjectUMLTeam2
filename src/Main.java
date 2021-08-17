
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    private static int menuInitialPlayer() throws Exception{

        System.out.println("\n============================================\n"+
                "1. Define a day for the tournament"+"\n"+
                "2. Adds basketball player"+"\n"+
                "3. Add cyclist player"+"\n"+
                "4. Add swimmer player"+"\n"+
                "5. Include a team"+"\n"+
                "6. Show if the swimming competition started "+"\n"+
                "0. Finish\n"+
                "====================================================\n");
        return(ReadKeyBoard.readInt());

    }

    private static void addPlayer(ListPlayer player, String discipline) throws Exception{
        boolean morePlayer = true;
        String firstName;
        String lastName;
        double height;
        double weight;

        while(morePlayer){
            System.out.println("Enter first name: ");
            firstName = ReadKeyBoard.readChain();
            System.out.println("Enter last name: ");
            lastName = ReadKeyBoard.readChain();
            System.out.println("Enter height: ");
            height = ReadKeyBoard.readDouble();
            System.out.println("Enter weight");
            weight = ReadKeyBoard.readDouble();
            if(discipline=="Swimming"){
                System.out.println("Enter the style of the swimmer: ");
                String style = ReadKeyBoard.readChain();
                player.addSwim(new Swim(firstName, lastName, discipline, height, weight, style));
            }else{
                player.addPlayer(new Player(firstName, lastName, discipline, height, weight));
            }
            System.out.println("Add more players");
            System.out.println("If your want to add more players enter 'true' otherwise enter 'false'");
            morePlayer = ReadKeyBoard.readBoolean();
        }
    }


    public static void main(String[] arg) throws ParseException {
        int option = 0;
        Map<String,Team> teams = new HashMap<String,Team>();
        String discipline;
        String nameTeam;
        String nameCoach;
        System.out.println("\n==================================================\n"+
                            "1. Travel"+"\n"+
                            "2. Player"+"\n"+
                            "==================================================\n");
        int chooseMenu = ReadKeyBoard.readInt();
        if(chooseMenu==1){



               // Scanner readKeyBoard = new Scanner(System.in);

                System.out.println("Datas of the Person : " +"\n======================="+"\nPlease, Enter first name ");
                String firstName = ReadKeyBoard.readChain();
                System.out.println("Please, Enter last name");
                String lastName = ReadKeyBoard.readChain();
                System.out.println("Please, Enter address");
                String address = ReadKeyBoard.readChain();
                System.out.println("Please, Enter birthday  with Format 'dd/MM/YYYY'");
                String birthday = ReadKeyBoard.readChain();

                Person person = new Person(firstName, lastName, address );


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
                            GregorianCalendar aux = new GregorianCalendar();
                            System.out.println("how many days is the day celebrated?");
                            int days = ReadKeyBoard.readInt();

                            while (days<1 || days>3){
                                System.out.print("Minimum One, Maximum 3 :)\n");
                                days = ReadKeyBoard.readInt();
                            }
                            List<String> listaDeFechas = new ArrayList<>();

                            for(int i=0;i<days; i++){
                                System.out.print("Date " + (i+1) + " :\n");
                                System.out.print("Indicate the day \n");
                                int day = ReadKeyBoard.readInt();
                                System.out.print("Indicate the month \n");
                                int month = ReadKeyBoard.readInt();
                                System.out.print("Indicate the year \n");
                                int year = ReadKeyBoard.readInt();
                                listaDeFechas.add(day+"/"+month+"/"+year);
                            }
                            System.out.println("Enter the Headquarter:");
                            String  headquarter = ReadKeyBoard.readChain();
                            String startDate = listaDeFechas.get(0);
                            String endDate = listaDeFechas.get(listaDeFechas.size()-1);
                            Tournament tournament = new Tournament(startDate, endDate, headquarter);
                            System.out.println(tournament.displayDataTournament());
                            break;
                        case 2:
                            discipline = "Basketball";
                            addPlayer(player, discipline);
                            System.out.println(" *  BASKETBALL PLAYERS  *");
                            player.displayPlayer();
                            break;
                        case 3:
                            discipline = "Cyclist";
                            System.out.println("=============================");
                            System.out.println("Enter a Cyclist");
                            addPlayer(player, discipline);
                            System.out.println("=============================");
                            System.out.println("Enter data of the bicycle");
                            System.out.println("Model of the bicycle: ");
                            String model = ReadKeyBoard.readChain();
                            System.out.println("Hoop number of the bicycle: ");
                            int hoopNumber = ReadKeyBoard.readInt();
                            System.out.println("=============================");

                            System.out.println("*  CYCLIST PLAYERS  *");
                            player.displayPlayer();
                            System.out.println("=============================");
                            System.out.println("Data of the Bicycle");
                            Bike bike = new Bike(model, hoopNumber);
                            System.out.println(bike.displayBicycle());
                            break;
                        case 4:
                            discipline = "Swimming";
                            System.out.println("=============================");
                            System.out.println("Enter a Swimmer");
                            addPlayer(player, discipline);
                            System.out.println("=============================");

                            System.out.println("*  SWIMMER PLAYERS  *");
                            player.displaySwim();
                            break;
                        case 5:
                            System.out.print("Enter name of Team:  ");
                            nameTeam = ReadKeyBoard.readChain();
                            System.out.print("Enter name of the coach:  ");
                            nameCoach = ReadKeyBoard.readChain();
                            boolean existTeam = teams.containsKey(nameTeam);
                            if (existTeam) {
                                System.out.println("There is already a club with that name");
                            }else{
                                Team team = new Team(nameTeam, nameCoach);
                                teams.put(nameTeam, team);
                                System.out.println("The team has been added to tournament");
                            }

                            break;
                        case 6:
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