import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       double secret = Math.random() * 5;
       secret += 1;

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
       int guess = scan.nextInt();

       while(guess != secret){
         System.out.println("Guess Again!");
         int guess2 = scan.nextInt();
       }
       
       //See Learn the Part for detailed instructions.
        
        scan.close();
    }

}
