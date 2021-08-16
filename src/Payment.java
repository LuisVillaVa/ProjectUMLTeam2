public class Payment {
   float price;

    public Payment(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void display(){
        System.out.println(price);
    }


}
