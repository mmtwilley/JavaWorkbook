import java.util.Arrays;

public class Main{
    public static void main(String[] args){

        PersonSix person = new PersonSix("Rayan Slim", "Canadian","01/11/1111",5);



        System.out.println("Name: " + person.getName() + "\n" + 
        "Nationality: " + person.getNationality() + "\n" + 
        "Date of Birth: " + person.getDateOfBirth() + "\n" +
        "Seat Number: " + person.getSeatNumber() + "\n" + "Passport: " +
        Arrays.toString(person.getPassport()) + "\n");
    }
}