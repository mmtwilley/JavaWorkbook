public class CityPopulationTracker {
    private HashMap<String, City> cityPopulations;

    public CityPopulationTracker(){
        this.cityPopulations = new HashMap<>();
    }

    public City getCity(City newCity){
        return new City(this.cityPopulations.get(newCity));
    }

    public void setOraddCity(City city){
        this.cityPopulations.put(city.getName(), new City(city));
    }

}
