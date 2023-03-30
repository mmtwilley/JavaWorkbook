public class Main{
    public static void main(String[] args){
        String[] country = {"United States"};
        Person personOne = new Person("Rayan Slim","Canadian", "01/01/1111", country, 5);
        System.out.println("Name: " + personOne.getName() + "\n" + "Nationality: " + personOne.getNationality() + "\n" + "Date of Birth: "
         + personOne.getDateOfBirth() + "\n" + "Seat Number: " + personOne.getSeatNumber() + "\n");

        personOne.setSeatNumber(10);

        System.out.println(personOne.toString());

    }
}