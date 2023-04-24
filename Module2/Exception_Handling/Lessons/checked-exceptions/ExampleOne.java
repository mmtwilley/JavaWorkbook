import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("Module2/Exception_Handling/Lessons/checked-exceptions/greetings.txt");
            Scanner scanner = new Scanner(fis);
            System.out.println(scanner.nextLine());
            scanner.close();
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Process Complete");
        }

    }
    
}