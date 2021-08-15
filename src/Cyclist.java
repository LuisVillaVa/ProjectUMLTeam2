public class Cyclist extends Player{
    Bike bike = new Bike("Venzo", 29);
    boolean state;

    public Cyclist(){}

    public Cyclist(String name, String athleticDiscipline, double height, double weight, boolean state) {
        super(name, athleticDiscipline, height, weight);
        this.state = state;
    }

    boolean fixBike(){
        if(state){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String displayData(){
        return "Name is: "+getName()+" this in the discipline: "+getAthleticDiscipline()+" has a height of: "+getHeight()+" and a weight of:"+getWeight();
    }
}