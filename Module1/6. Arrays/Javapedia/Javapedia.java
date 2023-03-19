import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        //Task 1 – Ask the user: how many historical figures will you register?
        //       – Store the value.
        int figures = scan.nextInt();
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.         
        String[][] database = new String[figures][3];
        //Watch out for the nextLine() pitfall. 
        scan.nextLine();
       
        for (int i = 0; i < database.length; i++) {

            System.out.println("\n\tFigure " + (i+1)); 
            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();             
            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine();
            System.out.print("\n");
        }
        
       

        System.out.println("These are the values you stored:"); 
        //Task 4: call print2DArray. 

        print2DArray(database);

        System.out.print("\nWho do you want information on? ");  

        String figure = scan.nextLine();
        search(figure, database);

        scan.close();
    }


    public static void print2DArray(String[][] database){
        for(int i = 0; i < database.length; i++){
            System.out.println("\t" + database[i][0] + " " + database[i][1] + " " + database[i][2]);
        }
    }

    public static void search(String figure,String[][] database){
        for(int i = 0; i < database.length; i++){
            if(database[i][0].equals(figure)){
                System.out.println("\t Name: " + database[i][0]);
                System.out.println("\t Date of birth: " + database[i][1]);
                System.out.println("\t Occupation: " + database[i][2]);
            }
        }
    }

}
