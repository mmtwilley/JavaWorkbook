public class Main{
    public static void main(String[] args){
        String[] country = {"United States"};
        Person personOne = new Person("Rayan Slim","Canadian", "01/01/1111", country, 5);
        System.out.println("Name: " + personOne.name + "\n" + "Nationality: " + personOne.nationality+ "\n" + "Date of Birth: "
         + personOne.dateOfBirth + "\n" + "Seat Number: " + personOne.seatNumber + "\n");
    }
}