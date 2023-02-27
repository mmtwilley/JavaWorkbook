package Demo.Function;

public class ReturnValues {
    public static void main(String[] args){
        double area1 = calculateArea(2.3, 3.5);
        double area2 = calculateArea(1.6, 2.4);
        double area3 = calculateArea(2.6, 4.3);

        
    }

    public static double calculateArea(double length, double width){
        if(length < 0 || width < 0){
            System.out.println("INVALID DIMENSIONS");
            System.exit(0);
        }
        return length * width;
    }

    public static String explainArea (String language){
        switch(language){
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spainish": return "area es igual a largo * ancho";
            default: 
              return "Language not found";
        }
    }

   public static void print(double length, double width, double area){
        System.out.println("A rectangle with a length of " + length + " and a width of " + width + " has an area of " + area);
   }
}
