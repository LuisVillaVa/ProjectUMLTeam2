public class Cash extends  Payment {


    float desc;
    float  descuento  ;

    public Cash(float price) {
        super(price);
    }

    public float getDesc() {
        return desc;
    }

    public void setDesc(float desc) {
        this.desc = desc;
    }

     public float descu(){
        return descuento = (price * desc)/100;
     }

    @Override
    public void display() {
        System.out.println("*  CASH  *");
        System.out.println("The Price is: "+ price);
        System.out.println("Discount is :"+ descu() + "$ =>" + desc + "%");
        System.out.println("Cash total amount is: " +  (price - descuento) + "  $ Dollar of discount  ");
    }


}
