public class Swim extends Player{
    String style;
    String lane;
    String nameClub;
    boolean startSwim;

    public Swim(boolean startSwim){
        this.startSwim = startSwim;
    }

    public Swim(String style){
        this.style = style;
    }

    public Swim(String name, String athleticDiscipline, double height, double weight, String style) {
        super(name, athleticDiscipline, height, weight);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public boolean isStartSwim() {
        return startSwim;
    }

    String startSwim(){
        if(isStartSwim()){
            return "the swimming competition has already started";
        }else{
            return  "The competition has not started yet, the competitors are waiting";
        }
    }

    @Override
    public String displayData(){
        return "Name is: "+getName()+" this in the discipline: "+getAthleticDiscipline()+" has a height of: "+getHeight()+" and a weight of:"+getWeight()+
                " with a style: "+getStyle();
    }
}