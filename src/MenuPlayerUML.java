import java.text.SimpleDateFormat;
import java.util.*;

public class MenuPlayerUML {
    String discipline;
    String nameTeam;
    String nameCoach;
    int option = 0;

    Map<String,Team> teams = new HashMap<String,Team>();
    SimpleDateFormat obj = new SimpleDateFormat("dd/MM/yyyy");

    public int menuInitialPlayer() throws Exception{

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

    private void addPlayer(ListPlayer player, String discipline) throws Exception{
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

    public void functionMenuPlayer(){
        do {
            try {
                option = this.menuInitialPlayer();
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
                        String startDate = obj.parse(listaDeFechas.get(0)).toString();
                        String endDate = obj.parse(listaDeFechas.get(listaDeFechas.size()-1)).toString();
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
}
