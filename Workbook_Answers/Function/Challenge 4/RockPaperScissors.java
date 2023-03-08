import java.util.Scanner;
import java.util.function.Function;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");


    //Task 1: See if the user wants to play. 
        String userAnswer = scan.nextLine();
        if(!userAnswer.equalsIgnoreCase("yes")){
            System.out.println("Darn, some other time...!");
            System.exit(0);
        }

    /*Task 2: Set up the game
        

       • if the answer is yes: 
             – print: Great!
             – print: rock - paper - scissors, shoot!
             – pick up user's choice.
             – get the computer choice (can only be done after task 3).
             – get the result (can only be done after task 4)
             – print everything (can only be done after task 5).
        
    */
        System.out.println("Great");
        System.out.println("rock - paper - scissors, shoot!");
        String userChoice = scan.nextLine();
        if(!userChoice.equals("rock") || !userChoice.equals("scissors") || !userChoice.equals("paper")){
            System.out.println("Pick the correct answer next time!");
            System.exit(0);
        }
 

        printResult(userChoice, computerChoice());

        scan.close();
    }


    //Task 3  – Write a function where the computer picks a random choice.

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */

    public static String computerChoice(){
        double randomChoice = Math.random() * 3;
        randomChoice +=1;
        String result = "";
        switch((int)randomChoice){
            case 1:
                result = "rock";
                break;
            case 2:
                result =  "paper";
                break;
            case 3:
                 result = "scissors";
                 break;
        }
        return result;
    } 

    //Task 4  – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   
     *   1. result is "You win!" if:
     *
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     *
     *   3. Otherwise, the result is "You lose!":
     * 
     * 
     *   4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     *
     */

    public static String result(String yourChoice, String computerChoice) {


        if(yourChoice.equals(computerChoice)){
            return "It's a tie";
        }
      
        if(yourChoice.equals("rock") && computerChoice.equals("paper")){
            return "You lose!";
        }
        if(yourChoice.equals("scissors") && computerChoice.equals("rock")){
            return "You lose!";
        }
        if(yourChoice.equals("paper") && computerChoice.equals("rock")){
            return "You lose!";
        }


        return "You win!";
    }
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */


     public static void printResult(String yourChoice, String computerChoice){
         System.out.println("Computer's choice: " + computerChoice);
         System.out.println("Your Choice: " + yourChoice);
         System.out.println(result(yourChoice, computerChoice));
     }

     public static void printResult(String yourChoice, String computerChoice, String result){
        System.out.println("Computer's choice: " + computerChoice);
        System.out.println("Your Choice: " + yourChoice);
        System.out.println(result);
    }
}
