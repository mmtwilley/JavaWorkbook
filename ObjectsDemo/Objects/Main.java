 public class Main {

    // objects things that contains fields or can perform tasks. 
    // Mutable Object = objects with setters
    //  -- avoid setting variables equal to each other 
    //  -- Both variables will share a reference to the same object
    public static void main(String[] args){
        String[] spareParts = new String[]{"Tires","Keys","Filter","Brake"};

        Car nissan = new Car("Nissan",10000, 2019, "blue",spareParts);
        Car dodge = new Car("Dodge",12000,2019,"green",spareParts);

        Car nissan2 = new Car(nissan);

        nissan2.drive();
    }
}