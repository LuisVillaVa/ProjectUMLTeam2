public class Hotel {

    String name;
    String category;
    String emailHotel;
    String room;

    public Hotel(String name, String category, String emailHotel, String room) {
        this.name = name;
        this.category = category;
        this.emailHotel = emailHotel;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
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
    public void displayHotel() {
        System.out.println( "*  HOTEL *" +
                            "\nName Hotel  is: " + name +
                            "\nCategory is:  " + category +
                            "\nEmail is: "+ emailHotel +
                            "\nType Room  is: "+ room);
    }
}
