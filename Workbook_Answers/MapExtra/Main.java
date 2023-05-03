import java.util.Scanner;

class Main{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        City city1 = new City("New York", "USA", 8500000);
        System.out.println(city1.getName());
    
    
        // Uncomment the following line to test invalid input for setName method
        //city1.setName("");
    
    
        // Uncomment the following line to test invalid input for setCountry method
        // city1.setCountry("");
    
    
        // Uncomment the following line to test invalid input for setPopulation method
        //city1.setPopulation(-1);
    
    
        // Uncomment the following line to test invalid input for the constructor
         City city2 = new City("", "USA", 8500000);
    }    

    public static boolean isNullOrBlank(String input){
        return (input.isBlank() || input == null);
    }
    public static boolean incorrectPopulation(int population){
        return (population <= 0 );
    }

    public static String promptForCityName(Scanner scanner){
        while(true){
            System.out.print("\nPlease enter a valid city name: ");
            string cityName = scanner.newLine();
            if(!isNullOrBlank(cityName)){
                return cityName;
            }
           
        }
    }

    public static String promptForCountry(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid country: ");
            String country = scanner.nextLine();
            if(!isNullOrBlank(country)){
                return country;
            }
        }
    }

    public static int promptForPopulation(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid population (greater than 0): ");
            if(scanner.hasNextInt()){
                scanner.next();
                continue;
            }
    
            int population = scanner.nextInt();
            if(!incorrectPopulation(population)){
                return population;
            }
        }
    }    
    
}