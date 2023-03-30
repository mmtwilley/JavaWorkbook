 public class Main {

    // objects things that contains fields or can perform tasks. 
    // Mutable Object = objects with setters
    //  -- avoid setting variables equal to each other 
    //  -- Both variables will share a reference to the same object
    public static void main(String[] args){
        Car nissan = new Car("Nissan",10000, 2019, "blue",new String[]{"Tires","Keys","Brake"});
        Car dodge = new Car("Dodge",12000,2019,"green",new String[]{"Tires","Keys","Brake"});

        nissan2.drive();
    }
}