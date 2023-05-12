public abstract class LabEquipment{
    private String manufacturer;
    private String model;
    private int year;
    final static int Minimum_Year = 1950;

    public LabEquipment(String manufacturer, String model, int year) {
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
    }

    public LabEquipment(LabEquipment labEquipment){
        setMaufacturer(labEquipment.manufacturer);
        setModel(labEquipment.model);
        setYear(labEquipment.year);
    }
    

    public void setMaufacturer(String manufacturer){
        if(manufacturer.isBlank() || manufacturer == null){
            throw new IllegalArgumentException("Manufacturer cannot be null or blank.");
        }
        this.manufacturer = manufacturer;
    }

    public void setModel(String model){
        if(model.isBlank() || manufacturer == null){
            throw new IllegalArgumentException("Models cannot be null or blank.");
        }
        this.model = model;
    }

    public void setYear(int year){
        if( year >= Minimum_Year){
            throw new IllegalArgumentException("Year must be greater than or equal to the minimum year.");
        }
        this.year = year;
    }
    
    public String getMaufacturer(){
        return this.manufacturer;
    }

    public String getModel(){
        return this.model;
    }

    public int getYear(){
        return this.year;
    }

    public abstract String performMaintenance();

    public abstract LabEquipment clone();

}