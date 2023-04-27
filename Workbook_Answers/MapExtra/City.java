public class City{
    private String name;
    private String country;
    private long population;


    public void getName(){
        return this.Name;
    }

    public void getCountry(){
        return this.country;
    }

    public void getPopulation(){
        return this.population;
    }

    public String setName(String name){
        if(name.blank() || name = null){
            throw new IllegalArguementException("Name cannot be null or blank.");
        }
        this.name = name;
    }

    public String setCountry(String country){
        if(country.blank() || country = null){
            throw new IllegalArguementException("Country cannot be null or blank.");
        }
        this.country = country;
    }

    public Long setPopulation(Long population){
        if(population <= 0){
            throw new IllegalArguementException("Population must be greater than 0.");
        }
        this.population = population;
    }


}