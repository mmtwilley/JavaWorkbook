import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[4];

        // See instructions on Learn the Part (Workbook 6.9)
        System.out.print("The original prices are: ");
         
        for(int i = 0; i < price.length; i++){
            System.out.print(price[i] + " ");
        }

        System.out.println("The prices after tax are: ");

        for(int i = 0; i < afterTax.length; i++){
            afterTax[i] = price[i] + 1.13;
            System.out.print(afterTax[i] + " ");
        }
    }
}
