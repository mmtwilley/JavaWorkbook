Car{
    private String make;
    private String model;
    private String bodyType;
    private int productionYear;
    private double price;

    public void setMake(String make){
        if(!make.isBlank() || make == null){
            throw new IllegalArgumentException("Make cannot be null or blank.")
        }
        return this.make;
    }

    public void setModel(String model){
        if(!model.isBlank() || model == null){
            throw new IllegalArgumentException("Model cannot be null or blank.")
        }
        return this.model;
    }

    public void setBodyType(String bodyType){
        if(bodyType.i)
    }

    
}