import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        
        // Creating Stream from Datasource: Array
        String[] greetings = new String[]{"Hello!", "Hola!", "Bonjour!", "Hallo!"};
        Arrays.stream(greetings).forEach(greeting -> system.out.println(greeting));

        System.put.println("/n/n")

        // Creating Stream from Datasource: File
        try{
            Path path = Paths.get("chorus.txt");
        Files.lines(path).forEach(lines -> System.out.println);
        } catch(IOExpection exception){
            System.out.println(exception);
        }
        

    }
}