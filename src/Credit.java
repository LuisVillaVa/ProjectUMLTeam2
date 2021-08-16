public class Credit extends Payment {
    int quotas;

    public Credit(float price, int quotas) {
        super(price);
        this.quotas = quotas;
    }

    public  float getQuotas() {
        return quotas;
    }

    public void setQuotas(int quotas) {
        this.quotas = quotas;
    }

    public float  quotasTotal() {
        float total;
        if (quotas==0){

            total = price ;
        }
        else
        {
            total = price / quotas;
        }

         return total;
    }

    @Override
    public void display(){

        System.out.println( "-------------------------" +
                            "\nPAYMENT" +
                            "\n-------------------------");
        System.out.println("*  CREDIT  *");
        System.out.println( "Total amount is: " +  price  + " $ Dollar "+
                            "\nEach quota is of: " + quotasTotal() + " $ Dollar " +
                            "\nQuotas are: " + quotas );
    }
}
