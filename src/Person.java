import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    String firstName;
    String lastName;
    String ci;
    String birthDate;
    int phone;
    String address;
    char gender;

    public Person(){};

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Person(String firstName, String ci, String birthDate, int phone, String address, char gender) {
        this.firstName = firstName;
        this.ci = ci;
        this.birthDate = birthDate;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
        return "-----------------------\n * PERSON * \n-----------------------\n"+
                "First Name: " + getFirstName() +"\n"+
                "Last Name: " + getLastName() +"\n"+
                "Address: "+ getAddress();
    }

}