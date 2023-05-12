public class Microscope{
    private int magnification;
    static final int MinimumMaginification = 1;

    public Microscope(String manufacturer, String model, int year, int magnification){
        super(manufacturer, model, year);
        this.magnification = magnification;
    }

    public Microscope(Microscope microscope){
        super(microscope);
        setMagnification(microscope.magnification);
    }

    public void setMagnification(int magnification) {
        if(magnification < MinimumMaginification){
            throw new IllegalArgumentException("Magnification must be greater than or equal to the minimum magnification.");
        }
        this.magnification = magnification;
    }

    public int getMagnification(int magnification){
        return this.magnification;
    }

    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }

    @Override
    public Microscope clone(){
        return new Microscope(this);
    }
}