import java.util.Scanner;

public class Championship {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  
        System.out.println("What did Gryffindor score?");
        int gryffindor = scan.nextInt();
        System.out.println("What did Ravenclaw score?");
        int ravenclaw = scan.nextInt();    //ravenclaw points

        int margin = gryffindor - ravenclaw;
        
        if(margin >= 300){
            System.out.println("Gryffindor takes the house cup!");
        } else if (margin >= 0){
            System.out.println("In second place, Gryffindor!");
        } else if(margin >= -100){
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }

        scan.close();
    }
}
