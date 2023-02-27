import java.util.Scanner;

public class WorkSchedule {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

            System.out.println("What day of the week is it? The day can be any value between 1 (Monday) and 7 (Sunday).");
            int day = scan.nextInt();
            System.out.println("\nIs it an holyday? Enter a boolean.");
            scan.nextLine();
            boolean holiday = scan.nextBoolean();
            
            // IF - ELSE IF - ELSE HERE!

            if(day < 6 && holiday){
                System.out.println("woohoo, no work!");
            } else if( day < 6 && holiday == false) {
                System.out.println(" Wake up at 7:00 :(");
            } else {
                System.out.println("It's the weekend, no work!");
            }
        
            scan.close();
        }
    }
