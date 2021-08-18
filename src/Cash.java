public class Cash extends  Payment {
    private float desc;
    private float  descuento  ;
    //float total;

    public Cash(float price) {
        super(price);
    }

    public float getDiscountPorc() {
        return discountPorc;
    }

    public void setDiscountPorc(float desc) {
        this.discountPorc = desc;
    }

     public float discount(){
        return discount = (price * discountPorc)/100;
     }

    @Override
    public void display() {
        System.out.println("*  CASH  *");
        System.out.println("The Price is: "+ price);
        System.out.println("Discount is :"+ discount() + "$ =>" + discountPorc + "%");
        System.out.println("Cash total amount is: " +  (price - discount) + "  $ Dollar of discount  ");
    }


}
