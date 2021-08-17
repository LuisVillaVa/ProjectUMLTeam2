public class Cyclist extends Player{
    boolean state;

    public Cyclist(){}

    boolean fixBike(){
        if(state){
            return false;
        }else{
            return true;
        }
    }
}