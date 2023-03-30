import java.util.Arrays;

public class Person{
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;
    
    public Person(){
        
    }

    public Person(String name, String nationality, String dateOfBirth, String[] passport, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = Arrays.copyOf(passport, passport.length);
        this.seatNumber = seatNumber;
    }

    public String toString(){
        return "Name: " + this.name + "\n" +
        "Nationality: " + this.nationality + "\n" +
        "DOB : " + this.dateOfBirth + "\n" + 
        "Passport: " + Arrays.toString(passport) + "\n" +
        "Seat Number : " + this.seatNumber + "\n";
    }
}