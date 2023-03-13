import java.util.Random;

public class Doubles {
    public static void main(String[] args) {

   //      See Learn the Part for instructions.
       
        int dice1 = rollDice();
        int dice2 = rollDice();

        printDice(dice1, dice2);


        while(dice1 != dice2){
            dice1 = rollDice();
            dice2 = rollDice();

            printDice(dice1, dice2);
        }
        System.out.println("You rolled doubles!");
    }

    public static int rollDice(){
        double randomNum = Math.random()*6;
        return (int)randomNum + 1;
    }

    public static void printDice(int dice1, int dice2){
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");
    }
}





