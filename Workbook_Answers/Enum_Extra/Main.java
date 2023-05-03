import java.util.Scanner;
\import enum_extra.Car.*;


public class Main{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

    }

    public static boolean isNullOrBlank(String input){
       return input.isBlank() || input == null; 
    }

    public static boolean invalidYear(int year){
        return year < Minimum_Year;
    }

    public static boolean invaildPrice(double Price){
        return price < Low_Price || price > Max_Price; 
    }

    public static boolean invalidBodyType(String bodyType){
        try{
            BodyType.valueOf(bodyType.toUpperCase());
            return false;
        }catch(IllegalArgumentException exception){
            return true;
        }
    }

    public static BodyType promptForBodyType(Scanner scanner){
        while(true){
            System.out.print("\nPlease enter a valid car body type: ");
            String bodyType = scanner.nextLine();
            if(!invalidBodyType(bodyType)){
                return BodyType.valueOf(bodyType.toUpperCase());
            }
        }
    }

    public static String promptForMake(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car make: ");
            String make = scanner.nextLine();
            if(!isNullOrBlank(make)){
                return make;
            }
        }
    }

    public static String promptForModel(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car model: ");
            String model = scanner.nextLine();
            if(!isNullOrBlank(model)){
                return model;
            }
        }
    }

   
    public static double promptForPrice(Scanner scanner) {
         while (true) {
            System.out.print("\nPlease enter a valid car price: ");
            if(!scanner.hasNextDouble()){
                scanner.next();
                continue;
            }
            double price = scanner.nextDouble();
            if(!invaildPrice(price)){
                return price;
            }
        }
    }
    
    public static int promptForYear(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid production year: ");
            if(!scanner.hasNextInt()){
                scanner.next();
                continue;
            }
            int year = scanner.nextInt();
            if(!invalidYear(year)) return year;
        }
    }
  
}