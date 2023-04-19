import java.time.LocalDate;
import java.time.Period;

public class Contact{
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

   public Contact(String name, String phoneNumber, String birthDate){
       this.name = name;
       this.phoneNumber = phoneNumber;
       this.birthDate = birthDate;
       this.age = toAge(birthDate);
   }

   public Contact(Contact source){
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

   private int toAge(String birthDate){
      LocalDate birth = LocalDate.parse(birthDate);
      LocalDate now = LocalDate.now();
      return Period.between(birth, now).getYears();
    }

   public String getName(){
     return this.name;
   }

   public void setName(String name){
     this.name = name;
   }


    public int getAge(){
        return this.age;
    }

    private void setAge(int age){
        this.age = age;
    }
    
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

}