public class Player extends Person{
    double height;
    int playerNumber;
    String position;
    double weight;
    String athleticDiscipline;

    public Player(){}

    public Player(String firstName, String lastName, String athleticDiscipline, double height, double weight){
        super(firstName, lastName);
        this.height = height;
        this.athleticDiscipline = athleticDiscipline;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public String getAthleticDiscipline() {
        return athleticDiscipline;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String displayData(){
        return "\n=======================\n"+
                "First Name: "+ getFirstName() +"\n"+
                "Last Name: " + getLastName() +"\n"+
                "Discipline: "+ getAthleticDiscipline() +"\n"+
                "Height: "+ getHeight()+"\n"+
                "Weight: "+ getWeight() +"\n";
    }
}