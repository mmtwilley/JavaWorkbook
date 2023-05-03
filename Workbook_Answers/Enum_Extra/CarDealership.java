import java.util.ArrayList;

public class CarDealship{
    private ArrayList<Car> cars;

    public CarDealship(){
        this.cars = new ArrayList<Car>();
    }

    public Car getCar(int index){
        cars.get(new Car(index));
    }

    public Car setCar(Car car, int index){
        cars.set(index, new Car(car));
    }

    public Car addCar(Car car){
        cars.add(new Car(car));
    }
}