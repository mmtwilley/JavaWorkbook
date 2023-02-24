package Dealership;

import java.util.Scanner;

public class Dealership {
    public static void mainI(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership.");

        System.out.println(" . Select option 'a' to buy a car.");
        System.out.println(". Select option 'b' to sell a car.");

        String option = scan.nextLine();

        int budget;

        switch(option){
            case "a": 
               System.out.println("What is your budget?");
               budget = scan.nextInt();
               
               if(budget >= 10000){
                    System.out.println("Great! A Nissan Altima is available");
                    System.out.println("\n Do you have Insurance? Write 'yes' or 'no'?");
                    scan.nextLine();
                    String insurance  = scan.nextLine();
                    System.out.println("\n Do you have Insurance? Write 'yes' or 'no'?");
                    String license = scan.nextLine();
                    System.out.println("\n What is your credit score?");
                    int creditScore = scan.nextInt();
                    if(insurance.equals("yes") && license.equals("yes") && creditScore > 600){
                        System.out.println("Sold! Pleasure doing business with you!");
                    }else{
                        System.out.println("We're sorry. You are not eligible.");
                    }
            } else {
                System.out.println(" We don't sell cars under $10,000. Sorry!");
            }
               break;
            case "b":
               System.out.println("\n What is your car valued at?");
               int value = scan.nextInt();
               System.out.println("\n What is your selling price?");
               int price = scan.nextInt();

                if(value > price && price < 30000){
                    System.out.println("\n We will buy your car. Pleasure doing business with you!");  
                } else {
                    System.out.println("\n Sorry, we're not interested.");
                }
               break;
            default:
             System.out.println("invalid option");
        }

        scan.close();
    }
}
