public class Car{
    private String make;
    private String model;
    private BodyType bodyType;
    private int productionYear;
    private double price;

    public final static int Minimum_Year = 1900;
    public final static double Max_Price = 200000;
    public final static double Low_Price = 0;

    public enum BodyType { SEDAN, COUPE, HATCHBACK, SUV, TRUCK, VAN }
      

    public Car(String make, String model, BodyType bodyType, int productionYear, double price) {
        setMake(make);
        setModel(model);
        setBodyType(bodyType);
        setProductionYear(productionYear);
        setPrice(price);
    }
    
    public Car(Car source){
        setMake(source.make);
        setModel(source.model);
        setBodyType(source.bodyType);
        setProductionYear(source.productionYear);
        setPrice(source.price);
    }

    public void setMake(String make){
        if(!make.isBlank() || make == null){
            throw new IllegalArgumentException("Make cannot be null or blank.");
        }
        this.make = make;
    }

    public void setModel(String model){
        if(!model.isBlank() || model == null){
            throw new IllegalArgumentException("Model cannot be null or blank.");
        }
        this.model = model;
    }

    public void setBodyType(BodyType bodyType){
        if(bodytype == null){
            throw new IllegalArgumentException("BodyType cannot be null.");
        }
        this.bodyType = bodyType;
    }

    public void setProductionYear(int year){
        if(year < Minimum_Year){
            throw new IllegalArgumentException("Production year must be greater than or equal to the minimum year.");
        }
        this.productionYear = year;
    }

    public void setPrice(Int price){
        if(price < Low_Price || price > Max_Price){
            throw new IllegalArgumentException("Price must be within a valid range.");
        }
        this.price = price;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public String bodyType(){
        return this.bodyType;
    }

    public int getProductionYear(){
        return this.productionYear;
    }

    public double getPrice(){
        return this.price;
    }
    
}