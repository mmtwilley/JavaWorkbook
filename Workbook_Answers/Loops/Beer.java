import java.util.Scanner;

public class Beer {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("How much beer is there to pass around ?");

       int beerQuanity = scanner.nextInt();
       System.out.println();
       for(int i = beerQuanity; i >= 1; i--){
            sing(i);
       }

       scanner.close();
    }

    public static void sing(int beer){
        System.out.println(beer + "bottles of beer on the wall, " + beer + " bottles of beer.");
        System.out.println("take one down, pass it around, "+ (beer-1) +" bottles of beer on the wall!.");
    }

}
