import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // See Learn the Part for the instructions.
        System.out.print("Hi Timmy, choose a number to count to:");
        int answer = scan.nextInt();

        System.out.println("Great! Here how it is done.");
        for(int i = 1; i <= answer; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        scan.close();
    }
}
