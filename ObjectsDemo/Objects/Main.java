 public class Main {

    // objects things that contains fields or can perform tasks. 
    public static void main(String[] args){
        Car nissan = new Car("Nissan",10000, 2019, "blue");
        Car dodge = new Car("Dodge",12000,2019,"green");

        System.out.println("This " + nissan.make + " is worth $" + nissan.price + 
        ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
        System.out.println("This " + dodge.make + " is worth $" + dodge.price + 
        ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");
    
    }
}