import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       double secret = Math.random() * 5;
       int secretInt = (int) secret;

       System.out.println(secretInt);

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
       int guess = scan.nextInt();

       while(guess != secretInt){
         System.out.print("Guess Again: ");
         guess = scan.nextInt();
       }

       System.out.println("You got it!");
       
       //See Learn the Part for detailed instructions.
        
        scan.close();
    }

}
