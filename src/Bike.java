public class Bike {
    String model;
    double price;
    int hoopNumber;

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
        return "The Model of the bicycle is: "+getModel()+" this has a price of: "+getPrice()+" and has a hoop number of: "+getHoopNumber();
    }
}