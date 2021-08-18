
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    public static void main(String[] arg) throws ParseException {
        MenuTravelUML menuTravel = new MenuTravelUML();
        MenuPlayerUML menuPlayer = new MenuPlayerUML();

        String discipline;
        String nameTeam;
        String nameCoach;
        Map<String,Team> teams = new HashMap<String,Team>();
        SimpleDateFormat obj = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("\n==================================================\n"+
                            "1. Travel"+"\n"+
                            "2. Player"+"\n"+
                            "==================================================\n");
        int chooseMenu = ReadKeyBoard.readInt();
        if(chooseMenu==1){
            menuTravel.addPerson();
            menuTravel.addHotel();
            menuTravel.addTransport();
            menuTravel.addTravel();
            menuTravel.chooseTypePayment();
                System.out.print(menuTravel.displayPerson());
            menuTravel.getAgePerson();
            menuTravel.displayTravel();
            menuTravel.displayHotel();
            menuTravel.displayTransport();
        }
        else if (chooseMenu==2) {
            menuPlayer.functionMenuPlayer();
        }
        else{
            System.out.println("Enter value 1 or 2");
        }
    }


}