public class Bike {
    private String model;
    private double price;
    private int hoopNumber;

    public Bike(){}

    public Bike(String model, int hoopNumber){
        this.model = model;
        this.hoopNumber = hoopNumber;
    }

    public String getModel() {
        return model;
    }

    public int getHoopNumber() {
        return hoopNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String displayBicycle(){
        return "=======================\n"+
                "Model: " + getModel() +"\n"+
                "Hoop Number: "+ getHoopNumber() +"\n"+
                "======================\n";
    }
}