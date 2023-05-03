public class City{
    private String name;
    private String country;
    private long population;


    public City(String name, String country, long population){
        setName(name);
        setCountry(country);
        setPopulation(population);
    }

    public City(City source){
        setName(source.name);
        setCountry(source.country);
        setPopulation(source.population);
    }

    public String getName(){
        return this.name;
    }

    public String getCountry(){
        return this.country;
    }

    public long getPopulation(){
        return this.population;
    }

    public void setName(String name){
        if(name.isBlank() || name == null){
            throw new IllegalArgumentException("Name cannot be null or blank.");
        }
        this.name = name;
    }

    public void setCountry(String country){
        if(country.isBlank()|| country == null){
            throw new IllegalArgumentException("Country cannot be null or blank.");
        }
        this.country = country;
    }

    public void setPopulation(long population){
        if(population <= 0){
            throw new IllegalArgumentException("Population must be greater than 0.");
        }
        this.population = population;
    }


}