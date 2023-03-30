
public class Main {
    public static void main(String[] args){
        Person personOne = new Person();

        System.out.println(personOne.toString());

        personOne.name = "Tudy";
        personOne.nationality = "American";
        personOne.dateOfBirth = "09/23/1987";
        personOne.passport = new String[]{"Germany","France", "South Korea", "Japan"};
        personOne.seatNumber = 8;

        System.out.println(personOne.toString());

    }
}
