import java.util.Arrays;

public class PersonEight {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;
    

    
    
    public PersonEight(String name, String nationality, String dateOfBirth,int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = new String[3];
        this.seatNumber = seatNumber;
    }


    public PersonEight (PersonEight source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
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

    public void setPassport(){
     this.passport = new String[]{this.name, this.nationality,this.dateOfBirth};
    }

    public int setSeatNumber(int seatNumber){
        return this.seatNumber = seatNumber;
    }

    
    public String toString(){
        return "Name: " + name + "\n" + "Nationality: " + 
        nationality + "\n" + "Date of Birth: " + 
        dateOfBirth + "\n" + "Seat Number: " +
        seatNumber + "\n" + "Passport: " + 
        Arrays.toString(passport) + "\n";
    }

    public boolean applyPassport(){
        int number = (int)(Math.random() * 2);
        return number == 1;
    }
    public int chooseSeat(){
        return(int)(Math.random() * 11 + 1);
    }
}
