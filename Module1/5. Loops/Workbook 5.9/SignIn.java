import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        String usernameEntry = scan.next();
        //pick up username
        System.out.print("- Password: ");
        String passwordEntry = scan.next();
        //pick up password

        // see Learn the Part for the remaining instructions.
        
        while(!(usernameEntry.equals(username)) || !(passwordEntry.equals(password))){
            System.out.println("\nIncorrect, please try again!\n");
            System.out.println("- Username: ");
            usernameEntry = scan.nextLine();
            System.out.println("- Password: ");
            passwordEntry = scan.nextLine();
        }
        
        System.out.println("Sign in successful. Welcome");
        /* will be useful for task 2
        
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("- Password: ");
            passwordEntry = scan.nextLine();

        
        */
        scan.close();
        
    }
}
