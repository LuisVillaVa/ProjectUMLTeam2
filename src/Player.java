public class Player extends Person{
    private double height;
    private int playerNumber;
    private String position;
    private double weight;
    private String athleticDiscipline;

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