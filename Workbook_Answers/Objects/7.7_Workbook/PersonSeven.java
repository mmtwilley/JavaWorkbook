public class PersonSeven {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;
    

    
    
    public PersonSix(String name, String nationality, String dateOfBirth,int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = new String[3];
        this.seatNumber = chooseSeat();
    }


    public PersonSix (PersonSix source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
    }


    public String getName(){
        return this.name;
    }

    public String getNationality(){
        return this.nationality;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public String[] getPassport(){
        return Arrays.copyOf(this.passport,this.passport.length);
    }

    public int getSeatNumber(){
        return this.seatNumber;
    }

    public String setName(String name){
       return this.name = name;
    }

    public String setNationality(String nationality){
        return this.nationality = nationality;
    }

    public String setDateOfBirth(String dateOfBirth){
        return this.dateOfBirth = dateOfBirth;
    }

    public String[] setPassport(){
        return this.passport = new String[]{this.name, this.nationality, this.dateOfBirth};
    }

    public int setSeatNumber(int seatNumber){
        return this.seatNumber = seatNumber;
    }

    
    public String toString(){
        return "Name: " + this.name + "\n" +
        "Nationality: " + this.nationality + "\n" +
        "DOB : " + this.dateOfBirth + "\n" + 
        "Passport: " + Arrays.toString(passport) + "\n" +
        "Seat Number : " + this.seatNumber + "\n";
    }

    public boolean applyPassport(){
        int number = (int)(Math.random() * 2);
        switch(number){
            case(1):
            return true;
        default:
            return false;
        }
    }
    public int chooseSeat(){
        return(int)(Math.random() * 11 + 1);
    }
}
