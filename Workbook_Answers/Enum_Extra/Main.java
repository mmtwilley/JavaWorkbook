public class Main{

    public static void main(String[] args){

    }

    public static boolean isNullOrBlank(String input){
       return input.isBlank() || input == null; 
    }

    public static boolean invalidYear(int year){
        return year < Minimum_Year;
    }

    public static boolean invaildPrice(double Price){
        return price < Low_Price || price > Max_Price; 
    }

    
}