import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    String name;
    String ci;
    String birthDate;
    int phone;
    String address;
    char gender;

    public Person(){};

    public Person(String name){
        this.name = name;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person(String name, String ci, String birthDate, int phone, String address, char gender) {
        this.name = name;
        this.ci = ci;
        this.birthDate = birthDate;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }


    public String getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    void calculateAge(String birthDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birth = LocalDate.parse(birthDate, formatter);
        LocalDate nowAge = LocalDate.now();

        Period period = Period.between(birth, nowAge);
        System.out.printf("You age is: %s years \n" ,
                period.getYears());

    }

    public String displayData(){
        return "Name is: " + getName() + " and my address is: "+ getAddress() ;
    }
}