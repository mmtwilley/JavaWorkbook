public class Centrifuge{
    private int maxRPM;
    static final int Minimum_RPM = 500;

    public Centrifuge(int maxRPM){
        super(manufacturer,model,year);
        setMaxRPM(maxRPM);
    }

    public void setMaxRPM(int maxRPM){
        if(maxRPM < Minimum_RPM){
            throw new IllegalAccessError("Max RPM must be greater than or equal to the minimum RPM.");
        }
        this.maxRPM = maxRPM;
    }

    public int getMaxRPM() {
        return this.maxRPM;
    }

    @Override
    public String performMaintenance() {
        return "Centrifuge maintenance: Check the rotor, clean the chamber, and lubricate the spindle.";
    }
}