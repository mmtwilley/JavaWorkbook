import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
         Magazine magazine2 = new Magazine("Magazine 2", "Publisher 2", 2, 2021);
    
    
        MagazineLibrary library = new MagazineLibrary();
        
        // Test the addMagazine method
        library.addMagazine(magazine1);
        library.addMagazine(magazine2);
    
    
        // Test the getMagazine method
        Magazine retrievedMagazine = library.getMagazine(0);
        System.out.println(retrievedMagazine.getTitle());
    
    
        // Test the setMagazine method
        Magazine newMagazine = new Magazine("Magazine 3", "Publisher 3", 3, 2022);
        library.setMagazine(newMagazine, 0);
    
    
        // Verify that the magazine was updated
        retrievedMagazine = library.getMagazine(0);
        System.out.println(retrievedMagazine.getTitle());
    
    
    }

    public static boolean isNullorBlank(String input){
        return input.isBlank() || input == null;
    }

    public static boolean incorrectIssueNumber(int issueNumber){
        return issueNumber <= 0; 
    }

    public static boolean incorrectPublicationYear(int  publicationYear){
        return publicationYear <= 0; 
    }

    public static String promptForTitle(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid title: ");
            String title = scanner.nextLine();
            if(!isNullorBlank(title)){
                return title;
            }
            
        }
    }
    
    public static String promptForPublisher(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid publisher: ");
            String publisher = scanner.nextLine();
            if(!isNullorBlank(publisher)){
                return publisher;
            }
            
        }
    }
    
    public static int promptForIssueNumber(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid issue number (greater than 0): ");
            if(!scanner.hasNextInt()){
                scanner.next();
                continue;
            }
            int issueNumber = scanner.nextInt();
            if(incorrectIssueNumber(issueNumber)){
                return issueNumber;
            }
        }
    }

    public static int promptForPublicationYear(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid publication year (greater than 0): ");
            if(!scanner.hasNextInt()){
                scanner.next();
                continue;
            }
            int publicationYear = scanner.nextInt();
            if(incorrectPublicationYear(publicationYear)){
                return publicationYear;
            }
        }
    }