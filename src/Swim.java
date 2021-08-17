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

    public Swim(String firstName, String lastName, String athleticDiscipline, double height, double weight, String style) {
        super(firstName, lastName, athleticDiscipline, height, weight);
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
        return "Style: "+getStyle();
    }
}