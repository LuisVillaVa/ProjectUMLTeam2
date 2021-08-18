public class Hotel {
    private String name;
    private int category;
    private String emailHotel;
    private String room;
    private float priceHotel;

    public  Hotel(){}

    public Hotel(String name, int category, String emailHotel, String room, float priceHotel) {
        this.name = name;
        this.category = category;
        this.emailHotel = emailHotel;
        this.room = room;
        this.priceHotel = priceHotel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getEmailHotel() {
        return emailHotel = "barcelo_Bavaro@gamil.com";
    }

    public void setEmailHotel(String emailHotel) {
        this.emailHotel = emailHotel;

    }
    public String getRoom() {
        return room ;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public float getPriceHotel() {
        return priceHotel;
    }

    public void setPriceHotel(float priceHotel) {
        this.priceHotel = priceHotel;
    }

    public void displayHotel() {
        System.out.println( "-----------------------\n" + "*  HOTEL *" + "\n-----------------------"+
                            "\nName Hotel  is: " + name +
                            "\nCategory is:  " + category + " Stars"+
                            "\nEmail is: "+ emailHotel +
                            "\nPreci  is: "+ getPriceHotel());
    }
}
