public class Cash extends  Payment {
    public Cash(float price) {
        super(price);
    }

    @Override
    public void display() {
        System.out.println("*  CASH  *");
        System.out.println("Cash total amount is: " + (price - 50 ) + " - 50 $ Dollar of discount  ");
    }
}
