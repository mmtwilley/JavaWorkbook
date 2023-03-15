import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.3).
        Scanner scan = new Scanner(System.in);
        String[] aisle = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        
        int lookedaisle = 0;
        System.out.println("Welcome to Java Grocers.");
        System.out.println("What can I help you find?");
      
        String item = scan.nextLine();

        for(int i = 0; i < aisle.length; i++){
            if(aisle[i].equals(item)){
                lookedaisle = i;
                break;
            }
        }
        System.out.println("\nWe have that in aisle: " + lookedaisle);
        

        scan.close();
    }
}
